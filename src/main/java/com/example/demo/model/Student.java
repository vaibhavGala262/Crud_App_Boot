package com.example.demo.model;
import jakarta.persistence.Entity;  // Makes class a db table 
import jakarta.persistence.GeneratedValue;      // For auto-increment ID.
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
    @Id // PK column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment PK
    private Long id;

    private String name;
    private String email;

    // Constructors
    public Student() {}
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters (needed by JPA)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}