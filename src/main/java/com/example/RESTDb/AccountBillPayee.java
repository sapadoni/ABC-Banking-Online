package com.example.RESTDb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="account", schema = "abcbanking")
public class AccountBillPayee {
    @Id
    private String user_name;

    private String account_ID;

    public AccountBillPayee() {
        super();
    }

    public AccountBillPayee(String account_ID, String account_name) {
        super();
        this.user_name = account_ID;
        this.account_ID = account_name;
    }

    public String getAccountId() {
        return user_name;
    }

    public void setAccountId(String account_ID) {
        this.account_ID = account_ID;
    }

    public String getAccountName() {
        return account_ID;
    }

    public void setAccountName(String account_name) {
        this.account_ID = account_name;
    }
}
