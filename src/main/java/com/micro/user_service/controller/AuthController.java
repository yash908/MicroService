package com.micro.user_service.controller;

import com.micro.user_service.model.LoginRequest;
import com.micro.user_service.model.JwtResponse;
import com.micro.user_service.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest loginRequest) {
        JwtResponse response = authService.authenticate(loginRequest); // ✅ Use 'authenticate', not 'login'
        return ResponseEntity.ok(response);
    }
}
