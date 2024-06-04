package com.fametro.usermanagement.service.exception;

public class UserNotFoundExeption extends Exception {
    public UserNotFoundExeption() {
        super("User not found");
    }
}
