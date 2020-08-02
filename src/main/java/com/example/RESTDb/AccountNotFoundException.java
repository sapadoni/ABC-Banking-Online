package com.example.RESTDb;


public class AccountNotFoundException extends Exception {
    private String account_ID;

    public AccountNotFoundException(String account_ID) {
        super(String.format("Account not found: %s", account_ID));
    }
}
