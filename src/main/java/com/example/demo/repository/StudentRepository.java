package com.example.demo.repository;

import com.example.demo.model.Student;                // Reference the model
import org.springframework.data.jpa.repository.JpaRepository; // Gives CRUD methods

// Extends JpaRepository, so you get all CRUD methods for Student out-of-the-box
public interface StudentRepository extends JpaRepository<Student, Long> {
}
