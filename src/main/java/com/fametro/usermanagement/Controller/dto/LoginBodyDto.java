package com.fametro.usermanagement.Controller.dto;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public record LoginBodyDto(String email, String password) {

    public static LoginBodyDto fromEntity(String email, String password) {
        return new LoginBodyDto(email, password);
    }
}