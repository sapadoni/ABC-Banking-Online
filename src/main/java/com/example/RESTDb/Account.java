package com.example.RESTDb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="account", schema = "abcbanking")
public class Account {
    @Id
    private String account_ID;

    private String account_name;

    public Account() {
        super();
    }

    public Account(String account_ID, String account_name) {
        super();
        this.account_ID = account_ID;
        this.account_name = account_name;
    }

    public String getAccountId() {
        return account_ID;
    }

    public void setAccountId(String account_ID) {
        this.account_ID = account_ID;
    }

    public String getAccountName() {
        return account_name;
    }

    public void setAccountName(String account_name) {
        this.account_name = account_name;
    }
}
