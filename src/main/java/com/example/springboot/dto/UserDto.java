package com.example.springboot.dto;

public class UserDto {
    private String name;
    private String email;
    private String lastName;
    private String passwordHash;

    public UserDto(){

    }
    public UserDto(String name, String email, String lastName, String passwordHash) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
    }


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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPassword() {
        return passwordHash;
    }
}
