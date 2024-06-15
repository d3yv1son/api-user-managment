package com.fametro.usermanagement.Controller.dto;

import com.fametro.usermanagement.entity.User;

public record UserDto(Long id, String name, String email, String telephone) {

    public static UserDto fromEntity(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getTelephone()
        );
    }
}
