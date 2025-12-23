package com.example.projectCRS.repository;
import java.util.*;
import com.example.projectCRS.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {



    @Query(nativeQuery = true,
           value="Select * from Student WHERE course= :course")
    List<Student> findByCourse(@Param("course") String courses );



}
