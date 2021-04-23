package com.st3.upgrad.Model;


import javax.persistence.*;

@Entity
@Table(name = "phonedir")
public class Phonedir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Name;
    private String Email;
    private  int number;

    public Phonedir(String name, String email, int number) {
        Name = name;
        Email = email;
        this.number = number;
    }

    public Phonedir() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
