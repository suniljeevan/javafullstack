package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;
@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/save") 
	public void insert(Student s) {
		studentService.saveStudent(s);
	}
	
	

}
