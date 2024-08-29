package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // This advice is rendered into response body
public class EmployeeNotFoundAdvice {
    // ExceptionHandler configures the advice to only respond when an EmployeeNotFoundException is thrown
    @ExceptionHandler(EmployeeNotFoundException.class)
    // ResponseStatus issues HTTP 404 error
    @ResponseStatus(HttpStatus .NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
