package com.pu.sims.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pu.sims.repositories.StudentRepository;
import com.pu.sims.entities.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/save")
	public void insert(@RequestBody Student s) {
		studentRepository.save(s);
		
	}
	@RequestMapping("/getAll")
	public List<Student> fetchAll() {
		
		return studentRepository.findAll();
		
	}

}







