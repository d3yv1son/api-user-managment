package com.fametro.usermanagement.advice;

import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.fametro.usermanagement.service.exception.NotFoundExeption;
import jakarta.servlet.ServletException;
import jakarta.websocket.DecodeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.w3c.dom.events.EventException;

import java.io.IOException;

@ControllerAdvice
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundExeption.class)
    public ResponseEntity<String> notFoundHandler(NotFoundExeption exeption){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(exeption.getMessage());
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<String> usernameNotFoundHandler(UsernameNotFoundException exeption){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(exeption.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> genericExeptionHandler(Exception exeption){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(exeption.getMessage());
    }

    @ExceptionHandler(ServletException.class)
    public ResponseEntity<String> servletExceptionHandler(ServletException exeption){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(exeption.getMessage());
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> ioExceptionHandler(IOException exeption){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(exeption.getMessage());
    }

    @ExceptionHandler(JWTDecodeException.class)
    public ResponseEntity<String> decodeExceptionHandler(JWTDecodeException exeption){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(exeption.getMessage());
    }


    @ExceptionHandler(JWTCreationException.class)
    public ResponseEntity<String> jwtCreationExceptionHandler(JWTCreationException exeption){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(exeption.getMessage());
    }

    @ExceptionHandler(JWTVerificationException.class)
    public ResponseEntity<String> jwtVerificationExceptionHandler(JWTVerificationException exeption){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(exeption.getMessage());
    }
}

