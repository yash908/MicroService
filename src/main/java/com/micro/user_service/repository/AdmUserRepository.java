package com.micro.user_service.repository;

import com.micro.user_service.model.AdmUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmUserRepository extends JpaRepository<AdmUser, Long> {
    AdmUser findByEmail(String email);
}
