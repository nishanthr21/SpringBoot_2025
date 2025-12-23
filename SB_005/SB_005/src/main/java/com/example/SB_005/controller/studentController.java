package com.example.SB_005.controller;

import com.example.SB_005.model.Student;
import com.example.SB_005.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class studentController {
    @Autowired
    studentService stc;

    @GetMapping("Student")

    public List<Student> getStudent(){
        return stc.getStudent();
    }

    @GetMapping("Student/{rno}")

    public Student getStudentByRollno(@PathVariable("rno") int roll_no){
        return stc.getStudentByRollno(roll_no);
    }
}

