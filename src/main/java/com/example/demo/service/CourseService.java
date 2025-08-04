package com.example.demo.service;
import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  // marks it as service layer part
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository ;


    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }

    public void deleteCourseById(Long id ){
        courseRepository.deleteById(id);
    }

    public Optional<Course> getCourseById(Long id){
        return courseRepository.findById(id);
    }

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }


}
