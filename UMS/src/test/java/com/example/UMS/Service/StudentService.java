package com.example.UMS.Service;
import com.example.UMS.Entity.Faculty;
import com.example.UMS.Entity.Student;
import com.example.UMS.Entity.Subject;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {

	public List<Student> getAllStudents();
	public Student getAStudent(int id);
	public double getTotalMarksForASubject(String subjectcode);
	public Map<String, Integer> getTotalMarksForAllSubject();
	public Map<Integer, Double> getAllStudentsTotalMarksForAllSubjects();
	public Map<Student, List<Subject>> getAllStudentsWithSubjects();
	public List<Faculty> getAllFacultyName();
	public List<Subject> getAllSubject();
	public Student createStudent(Student s);
	public Student updateStudent(int id,Student s);
	public int deleteStudent(int id);
	
}
