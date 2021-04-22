package com.st3.upgrad.Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long Id;
    @Column(name = "Username")
    private String Username;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @Column(name = "Email")
    private  String Email;
    @Column(name = "number")
    private int number;
    @Column(name = "password")
    private  String password;
    public User() {
    }

    public User(String username, String email, int number, String password) {
        Username = username;
        Email = email;
        this.number = number;
        this.password = password;
    }



    public void setUsername(String username) {
        Username = username;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public int getNumber() {
        return number;
    }



}
