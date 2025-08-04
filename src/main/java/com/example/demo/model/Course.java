package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment PK
    private Long id;

    private String name;
    private Long duration;

    public Course() {}
    public Course(String name , Long duration){
        this.name = name;
        this.duration = duration;

    }
    public Long getId(){
        return this.id;
    }
    public void setId(Long id ){
        this.id  = id;
    }
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public Long getDuration(){return this.duration;}
    public void setDuration(Long duration ){this.duration  = duration;}
}
