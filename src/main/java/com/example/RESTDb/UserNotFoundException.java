package com.example.RESTDb;

public class UserNotFoundException extends Exception {
    private int id;

    public UserNotFoundException(int id) {
        super(String.format("User not found: %s", id));
    }
}
