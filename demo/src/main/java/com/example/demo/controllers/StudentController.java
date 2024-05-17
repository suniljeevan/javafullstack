package com.example.demo.controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;
@RestController
@RequestMapping(path = "/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

     @PostMapping("/add")
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
     @GetMapping(value="/getAll")
     public List<Student> getAllStudents() {
         return studentService.getAllStudents();
     }

     @GetMapping("/{id}")
     public Optional<Student> getStudentById(@PathVariable Long id) {
         return studentService.getStudentById(id);
     }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        Optional<Student> student = studentService.getStudentById(id);
        if (student.isPresent()) {
            Student updatedStudent = student.get();
            updatedStudent.setName(studentDetails.getName());
            updatedStudent.setEmail(studentDetails.getEmail());
            return studentService.saveStudent(updatedStudent);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
