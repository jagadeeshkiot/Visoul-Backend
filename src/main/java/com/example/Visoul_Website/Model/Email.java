package com.example.Visoul_Website.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "emaildb")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email",nullable = false)
    private String email;
    public Email(){

    }

    public Email(String email){
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
