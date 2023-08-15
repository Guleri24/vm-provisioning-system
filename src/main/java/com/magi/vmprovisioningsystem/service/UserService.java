package com.magi.vmprovisioningsystem.service;

import com.magi.vmprovisioningsystem.entitiy.User;
import com.magi.vmprovisioningsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User getUserByEmailId(String emailId) {
        return userRepository.findByEmailId(emailId);
    }
}
