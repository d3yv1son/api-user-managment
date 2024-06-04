package com.fametro.usermanagement.Controller.dto;

import com.fametro.usermanagement.entity.User;

public record UserCreationDto(String name, String email, String password, String telephone) {

    public User toEntity() {
        return new User(email, password, name, telephone);
    }
}
