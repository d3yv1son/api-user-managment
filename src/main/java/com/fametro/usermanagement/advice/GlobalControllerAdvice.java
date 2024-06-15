package com.fametro.usermanagement.advice;

import com.fametro.usermanagement.service.exception.NotFoundExeption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<String> handleNotFound(NotFoundExeption exeption){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(exeption.getMessage());
    }
}
