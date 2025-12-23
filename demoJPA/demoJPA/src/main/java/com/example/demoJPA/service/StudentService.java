package com.example.demoJPA.service;

import com.example.demoJPA.model.Student;
import com.example.demoJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository sr;
    public List<Student> getAllStudents() {
        return sr.findAll();
    }

    public Student addStudent(Student student) {
        return sr.save(student);
    }

    public Student getStudentById(int rno) {
        return sr.getById(rno);
    }

    public void updateStudent(Student stu) {
        sr.save(stu);// update existing data or else creates new one
    }

    public void deleteByID(int rno) {
        sr.deleteById(rno);
    }

    public void deleteAllStudent() {
        sr.deleteAll();
    }

    public List<Student> getStudentByTechnology(String str) {
       return  sr.findByTechnology(str);
    }






    public List<Student> getStudentByAgeAndTechnology(int age, String technology) {
            return sr.findByAge(age,technology);}
}
