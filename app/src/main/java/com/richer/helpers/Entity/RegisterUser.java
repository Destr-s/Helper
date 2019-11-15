package com.richer.helpers.Entity;

public class RegisterUser {

    public String name;
    public String password;
    public String jwcName;
    public String jwcPassword;

    public RegisterUser(String name, String password, String jwcName, String jwcPassword) {
        this.name = name;
        this.password = password;
        this.jwcName = jwcName;
        this.jwcPassword = jwcPassword;
    }
}
