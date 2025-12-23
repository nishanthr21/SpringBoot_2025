package com.example.projectCRS.service;

import com.example.projectCRS.model.Course;
import com.example.projectCRS.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepo cr;
    public List<Course> getAllCourse() {
        return cr.findAll();
    }

    public Course addCourse(Course csr) {
        return cr.save(csr);
    }
}
