package com.example.demo.model;

public class TestCourse {
    public static void main(String[] args){
        Course course = new Course(1L, "Maths" , 7L);

        String name= course.getName();

        System.out.println(name);

        course.setName("Chemistry");

        System.out.println(course.getName());
    }
}
