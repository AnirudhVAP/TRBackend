package com.MongoSpring.MongoSpring.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "login")
public class UserDetails {
    private String username;
    private String password;
    private long mobilephone;
    private String email;
    private  String fullname;
    private String id;

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

    public long getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(long mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
