package com.example.RESTDb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="USER", schema = "abcbanking")
public class User {
    @Id
    private String user_ID;

    private String user_name;

    public User() {
        super();
    }

    public User(String user_ID, String user_name) {
        super();
        this.user_ID = user_ID;
        this.user_name = user_name;
    }

    public String getuserId() {
        return user_ID;
    }

    public void setUserId(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_Name) {
        this.user_name = user_name;
    }
}
