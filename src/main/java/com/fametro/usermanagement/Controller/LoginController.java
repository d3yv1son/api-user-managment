package com.fametro.usermanagement.Controller;

import com.fametro.usermanagement.Controller.dto.LoginBodyDto;
import com.fametro.usermanagement.Controller.dto.LoginResponseDto;
import com.fametro.usermanagement.auth.JwtService;
import com.fametro.usermanagement.entity.User;
import com.fametro.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginBodyDto loginBody) {
        var userPassToken = new UsernamePasswordAuthenticationToken(loginBody.email(), loginBody.password());
        var auth = authenticationManager.authenticate(userPassToken);
        var token = jwtService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDto(token));
    }
}
