package com.vikasa.shh_be.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globalExceptionHandling(ErrorDetails errorDetails, WebRequest request) {
        return new ResponseEntity<>(errorDetails, errorDetails.getStatusCode());
    }
}