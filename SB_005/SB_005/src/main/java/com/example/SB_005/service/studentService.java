package com.example.SB_005.service;
import java.util.*;

import com.example.SB_005.model.Student;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    List<Student> s= new ArrayList<>(
        Arrays.asList(
                new Student(1,"nish","astro"),
                new Student(2,"loga","python"))
    );

    public List<Student> getStudent(){
       return s;
    }


    public Student getStudentByRollno(int rollNo) {
        int index=0;
        for(int i=0;i<s.size();i++){
            if(s.get(i).getRno()==rollNo){
                index=i;
                break;
            }
        }
        return s.get(index);
    }
}
