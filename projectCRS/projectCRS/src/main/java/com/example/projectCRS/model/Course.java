package com.example.projectCRS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Course {
    @Id
    private int cid;
    private String cname;
    private int duration;
    private String trainer;
}
