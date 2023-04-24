package com.example.employeemananger.exception;

public class UserNotFoundException extends  RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
