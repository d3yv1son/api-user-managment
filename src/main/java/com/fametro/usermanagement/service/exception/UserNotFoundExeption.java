package com.fametro.usermanagement.service.exception;

public class UserNotFoundExeption extends NotFoundExeption {
    public UserNotFoundExeption() {
        super("User not found");
    }
}
