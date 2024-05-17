package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.daos.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentDao.findById(id);
    }

    public Student saveStudent(Student student) {
        return studentDao.save(student);
    }

    public void deleteStudent(Long id) {
        studentDao.deleteById(id);
    }
}

