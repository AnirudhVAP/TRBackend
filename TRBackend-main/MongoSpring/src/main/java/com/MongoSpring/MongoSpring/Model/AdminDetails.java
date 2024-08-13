package com.MongoSpring.MongoSpring.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
public class AdminDetails {
    private String username;
    private String password;
    private long mobile;
    private String message;

 public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

public AdminDetails(String message, long mobile) {
        this.message = message;
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
