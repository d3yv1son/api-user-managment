package com.fametro.usermanagement.Controller;

import com.fametro.usermanagement.Controller.dto.LoginBodyDto;
import com.fametro.usermanagement.Controller.dto.LoginResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public LoginResponseDto login(@RequestBody LoginBodyDto loginBody) {
        System.out.println(loginBody.email() + loginBody.password());
        String ficToken = "aleatoryToken";
        String ficMessage = "User was been loged";
        return LoginResponseDto.fromEntity(ficToken, ficMessage);
    }
}
