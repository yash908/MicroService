package com.micro.user_service.repository;

import com.micro.user_service.model.AdmUser;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmUserRepository extends JpaRepository<AdmUser, Long> {
    Optional<AdmUser> findByEmail(String email);
    Optional<AdmUser> findByEmailAndDob(String email, String dob);
}
