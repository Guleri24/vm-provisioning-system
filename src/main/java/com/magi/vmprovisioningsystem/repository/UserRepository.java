package com.magi.vmprovisioningsystem.repository;

import com.magi.vmprovisioningsystem.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmailId(String emailId);
}
