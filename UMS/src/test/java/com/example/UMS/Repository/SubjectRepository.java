package com.example.UMS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UMS.Entity.Student;
import com.example.UMS.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject,String>{
	
	List<Student> findStudentsById(String subjectId);

}
