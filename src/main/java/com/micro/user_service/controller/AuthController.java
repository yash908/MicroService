package com.micro.user_service.controller;

import com.micro.user_service.security.JwtUtil;
import com.micro.user_service.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import com.micro.user_service.model.AdmUser;
import com.micro.user_service.repository.AdmUserRepository;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private AdmUserRepository admUserRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(
        @RequestParam String email,
        @RequestParam String dob
    ) {
        Optional<AdmUser> user = admUserRepository.findByEmailAndDob(email, dob);
        if (user.isPresent()) {
        try {
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(email, dob.toString())
            );
        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }

        // Load user details and generate token
        var userDetails = userDetailsService.loadUserByUsername(email);
        String token = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok().body(token);        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
