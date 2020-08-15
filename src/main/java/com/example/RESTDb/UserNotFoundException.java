package com.example.RESTDb;

public class UserNotFoundException extends Exception {
    private int userId;

    public UserNotFoundException(int userId) {
        super(String.format("User not found: %s", userId));
    }
}
