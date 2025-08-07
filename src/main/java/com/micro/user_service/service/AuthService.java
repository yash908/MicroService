package com.micro.user_service.service;

import com.micro.user_service.model.JwtResponse;
import com.micro.user_service.model.LoginRequest;
import com.micro.user_service.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.micro.user_service.repository.AdmUserRepository;
import com.micro.user_service.model.AdmUser;

@Service
public class AuthService {

    @Autowired
    private AdmUserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public JwtResponse authenticate(LoginRequest request) {
        AdmUser user = userRepository.findByEmail(request.getEmail())
              .orElseThrow(() -> new UsernameNotFoundException("Invalid email"));


        if (!user.getDob().equals(request.getDob())) {
            throw new BadCredentialsException("Invalid DOB");
        }

        String token = jwtUtil.generateToken(user.getEmail());
        return new JwtResponse(token);
    }
}
