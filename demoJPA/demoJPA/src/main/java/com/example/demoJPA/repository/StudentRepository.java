package com.example.demoJPA.repository;

import com.example.demoJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByTechnology(String technology);

    @Query(
            value = "SELECT * FROM student WHERE age = :age AND technology = :technology",
            nativeQuery = true
    )
    List<Student> findByAge(
            @Param("age") int age,
            @Param("technology") String technology
    );
}

