package com.example.UMS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.UMS.Entity.Student;
import com.example.UMS.Entity.Subject;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	 // Custom query method to find students by their name
    List<Student> findByName(String name);

    // Custom query method with JPQL query
    @Query("SELECT s FROM Student s WHERE s.age >= ?1")
    List<Student> findByAgeGreaterThan(int age);
    
    //Custom query to fetch all students with their subjects
    @Query("SELECT s FROM Student s JOIN FETCH s.subjects")
    List<Student> findAllWithSubjects();
    
    List<Subject> findSubjectsById(Long studentId);
    
}
