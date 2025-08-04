package com.example.demo.controller;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/")
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCoursesById(@PathVariable Long id ){
        Optional<Course> course= courseService.getCourseById(id);

        return course.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());

    }

    @PostMapping("/")
    public Course createStudent(@RequestBody Course course){
        return courseService.createCourse(course);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id ){
        courseService.deleteCourseById(id);
        return ResponseEntity.noContent().build();
    }
}
