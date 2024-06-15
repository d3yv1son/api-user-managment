package com.fametro.usermanagement.service;

import com.fametro.usermanagement.entity.User;
import com.fametro.usermanagement.repository.UserRepository;
import com.fametro.usermanagement.service.exception.UserNotFoundExeption;
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

    public User findById(Long id) throws UserNotFoundExeption {
        return userRepository
                .findById(id)
                .orElseThrow(UserNotFoundExeption::new);
    }

    public User update(Long id, User user) throws UserNotFoundExeption {
        User userDB = findById(id);

        userDB.setEmail(user.getEmail());
        userDB.setName(user.getName());
        userDB.setPassword(user.getPassword());
        userDB.setTelephone(user.getTelephone());

        return userDB ;
    }

    public User create(User user) {
        return this.userRepository.save(user);
    }

    public User delete(Long id) throws UserNotFoundExeption{
        User getUser = findById(id);

        userRepository.deleteById(id);

        return getUser;
    }
}
