package com.fametro.usermanagement.controller.dto;

import com.fametro.usermanagement.entity.User;

public record UserDto(Long id, String name, String password, String email) {

    public static UserDto fromEntity(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getEmail()
        );
    }
}
