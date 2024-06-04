package com.fametro.usermanagement.Controller.dto;

import com.fametro.usermanagement.entity.User;

public record UserDto(Long id, String name, String password, String email, String telephone) {

    public static UserDto fromEntity(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getEmail(),
                user.getTelephone()
        );
    }
}
