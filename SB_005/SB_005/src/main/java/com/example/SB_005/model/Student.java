package com.example.SB_005.model;

import lombok.AllArgsConstructor;



public class Student
{
    private int rno;
    private String name;
    private String technology;


    public Student(int roll_no, String name, String technology) {
        this.rno=roll_no;
        this.name=name;
        this.technology=technology;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
