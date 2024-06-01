package com.fametro.usermanagement.Controller;

import com.fametro.usermanagement.Controller.dto.LoginBodyDto;
import com.fametro.usermanagement.Controller.dto.LoginResponseDto;
import com.fametro.usermanagement.auth.JwtService;
import com.fametro.usermanagement.entity.User;
import com.fametro.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public LoginResponseDto login(@RequestBody LoginBodyDto loginBody) {

        Optional<User> user = userRepository.findById(Long.valueOf(1));

        String token = jwtService.generateToken(user.orElse(null));
        String ficMessage = "User was been loged";
        return LoginResponseDto.fromEntity(token, ficMessage);
    }
}
