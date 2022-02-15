package com.demo.DesignPatterns.BuilderPattern;

import java.util.Date;

public class UserBuilder {
    private String name;
    private String email;
    private String mobile;
    private Date dob;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public UserBuilder setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public User build(){
        return new User(this.name,this.email,this.mobile,this.dob);
    }
}
