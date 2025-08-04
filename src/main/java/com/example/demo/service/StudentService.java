package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;  // For injecting dependencies
import org.springframework.stereotype.Service;              // Marks class as service

import java.util.List;
import java.util.Optional;

// Handles logic between controller and repository
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll(); // Get all students
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id); // Get by ID
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student); // Save or update student
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id); // Delete
    }
}
