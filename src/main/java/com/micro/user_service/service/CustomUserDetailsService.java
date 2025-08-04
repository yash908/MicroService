package com.micro.user_service.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // Replace with your actual user fetching logic, maybe using UserRepository
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Example static user
        return org.springframework.security.core.userdetails.User
                .withUsername("user")
                .password("{noop}password") // Use password encoder in real project
                .roles("USER")
                .build();
    }
}
