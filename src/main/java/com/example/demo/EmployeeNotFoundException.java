package com.example.demo;

// Used to render an HTTP 404 error

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }

}
