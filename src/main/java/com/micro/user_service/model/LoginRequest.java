package com.micro.user_service.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String dob;
}