package com.fametro.usermanagement.service.exception;

public class UnauthorisedExeption extends Exception {

    public UnauthorisedExeption() {
        super("User unauthorised");
    }
}
