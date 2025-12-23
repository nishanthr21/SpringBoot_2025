package com.example.SBSecurity.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Student {
    private int rollno;
    private String name;
    private String technology;


    public Student(int i, String virat, String tech) {
        this.rollno=i;
        this.name=virat;
        this.technology=tech;
    }

    public Student() {
    }
}
