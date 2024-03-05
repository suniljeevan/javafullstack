package com.example.UMS.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.UMS.Entity.Faculty;
import com.example.UMS.Entity.Subject;

@Service
public interface SubjectService {
	public List<Subject> getAllSubjects();
	public Subject getASubject(int id);
	public double getTotalMarksForASubject(String subjectcode);
	public Map<String, Integer> getTotalMarksForAllSubject();
	public Map<Integer, Integer> getAllStudentsTotalMarksForAllSubjects();
	public List<Faculty> getAllFacultyName();
	public Subject createSubject(Subject s);
	public Subject updateSubject(String id,Subject s);
	public int deleteSubject(int id);
}
