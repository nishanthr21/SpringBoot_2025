package com.example.projectCRS.controller;

import com.example.projectCRS.model.Student;
import com.example.projectCRS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
        @Autowired
        StudentService s;

         @GetMapping("/students")
             public List<Student> getAllStudent(){
        return s.getAllStudents();
             }

          @PostMapping("/students")
    public Student addStudent(@RequestBody Student str){
             return s.addStudent(str);
          }

    @GetMapping("/students/{roll_no}")
    public Student getByRollNo(@PathVariable("roll_no") int roll){
             return s.getByRoll(roll);
    }

    @PostMapping("/students/enrolled")
    public List<Student> getStudentEnrolled(@Param("course")String course){
return s.getEnrolledCourse(course);
    }
}
