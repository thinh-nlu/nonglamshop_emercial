package com.example.nonglamxanh_emercial.model;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String contact;
    private String isAdmin;

    public User(){
    }

    public User(int id, String username, String email, String password, String contact, String isAdmin) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
