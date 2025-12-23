package com.example.projectCRS.service;

import com.example.projectCRS.model.Student;
import com.example.projectCRS.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepo sr;


    public List<Student> getAllStudents() {
        return sr.findAll();
    }


    public Student addStudent(Student student) {
     return sr.save(student);
    }


    public Student getByRoll(int roll) {
        return sr.findById(roll).orElse(new Student());
    }

    public List<Student> getEnrolledCourse(String course) {
        return sr.findByCourse(course);
    }
}
