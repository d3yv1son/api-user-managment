package com.fametro.usermanagement.controller.dto;

import com.fametro.usermanagement.entity.User;

public record UserCreationDto(String name, String email, String password) {

    public User toEntity() {
        return new User(email, password, name);
    }
}
