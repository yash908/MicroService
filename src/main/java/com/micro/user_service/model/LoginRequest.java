package com.micro.user_service.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String dob;

    public String getEmail() {
        return email;
    }

    public void setEmail(String token) {
        this.email = token; // ✅ FIXED
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String token) {
        this.dob = token; // ✅ FIXED
    }
}
