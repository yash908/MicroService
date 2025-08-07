package com.micro.user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.micro.user_service.model.AdmUser;
import com.micro.user_service.repository.AdmUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // Replace with your actual user fetching logic, maybe using UserRepository
 @Autowired
private AdmUserRepository userRepository;

@Override
public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    AdmUser user = userRepository.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));

    return org.springframework.security.core.userdetails.User
            .withUsername(user.getEmail())
            .password("{noop}" + user.getDob()) // dob as password temporarily
            .roles("USER")
            .build();
}

}
