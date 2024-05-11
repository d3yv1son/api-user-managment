package com.fametro.usermanagement.service;

import com.fametro.usermanagement.entity.User;
import com.fametro.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User create(User user) {
        return this.userRepository.save(user);
    }
}
