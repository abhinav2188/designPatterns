package com.demo.DesignPatterns.BuilderPattern;

import java.util.Date;

public class User {

    private String name;
    private String email;
    private String mobile;
    private Date dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public User(String name, String email, String mobile, Date dob) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.dob = dob;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
}
