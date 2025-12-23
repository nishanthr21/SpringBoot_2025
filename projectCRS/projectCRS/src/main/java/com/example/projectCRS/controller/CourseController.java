package com.example.projectCRS.controller;

import com.example.projectCRS.model.Course;
import com.example.projectCRS.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService cs;
    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return cs.getAllCourse();
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course csr){
        return cs.addCourse(csr);
    }
}
