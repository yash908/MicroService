package com.micro.user_service.controller;

import com.micro.user_service.model.AdmUser;
import com.micro.user_service.repository.AdmUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private AdmUserRepository admUserRepository;

    @GetMapping("/{email}")
    public ResponseEntity<AdmUser> getUserByEmail(@PathVariable String email) {
        return admUserRepository.findByEmail(email)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<AdmUser> getAllUsers() {
        return admUserRepository.findAll();
    }
}
