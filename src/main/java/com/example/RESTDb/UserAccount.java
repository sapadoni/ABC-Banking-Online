package com.example.RESTDb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="user_account", schema = "abcbanking")
public class UserAccount{
    @Id
    private String user_name;

    private String user_account;

    public UserAccount() {
        super();
    }

    public UserAccount(String user_name, String user_account) {
        super();
        this.user_name = user_name;
        this.user_account = user_account;
    }

    public String getAccountId() {
        return user_name;
    }

    public void setAccountId(String account_ID) {
        this.user_name = user_name;
    }

    public String getAccountName() {
        return user_account;
    }

    public void setAccountName(String account_name) {
        this.user_account = user_account;
    }
}
