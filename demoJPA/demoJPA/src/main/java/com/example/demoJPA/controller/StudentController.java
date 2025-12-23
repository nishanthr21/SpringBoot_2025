package com.example.demoJPA.controller;

import com.example.demoJPA.model.Student;
import com.example.demoJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return s.getAllStudents();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student str) {
        return s.addStudent(str);
    }

    @GetMapping("/students/{rno}")
    public Student getStudentbyRno(@PathVariable("rno") int rnoo){
        return s.getStudentById(rnoo);
    }

    @PutMapping("/students")
    public String updateStudent( @RequestBody Student stu){
        s.updateStudent(stu);
        return "updated";
    }

    @DeleteMapping("/students/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno){
        s.deleteByID(rno);
        return "deleted";
    }
    @DeleteMapping("/students/clear")
    public String deleteAll(){
        s.deleteAllStudent();
        return"all students are deleted";
    }

    @GetMapping("/students/technology/{tech}")
    public List<Student> getStudentByTechnology(@PathVariable("tech") String str){
       return  s.getStudentByTechnology(str);
    }


    @PostMapping("/students/filter")
    public List<Student> getStudentByAgeAndTechnology(@Param("age")int age,
                                                      @Param("technology") String technology){

        return s.getStudentByAgeAndTechnology(age,technology);
    }
}
