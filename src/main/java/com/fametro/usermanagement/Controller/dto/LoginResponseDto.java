package com.fametro.usermanagement.Controller.dto;

public record LoginResponseDto(String token, String message) {

    public static LoginResponseDto fromEntity(String token, String message) {
        return new LoginResponseDto(token, message);
    }
}
