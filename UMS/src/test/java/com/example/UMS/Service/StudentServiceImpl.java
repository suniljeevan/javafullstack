package com.example.UMS.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.UMS.Entity.Course;
import com.example.UMS.Entity.Faculty;
import com.example.UMS.Entity.Student;
import com.example.UMS.Entity.Subject;
import com.example.UMS.Exception.NotFoundException;
import com.example.UMS.Repository.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService {
	@Autowired 
	private StudentRepository studentrepository;
	@Autowired 
	private SubjectService subjectservice;
	public List<Student> getAllStudents(){
		List<Student> students=studentrepository.findAll();
		return students;
	}
	
	public Map<Student, List<Subject>> getAllStudentsWithSubjects(){
		return null;
	}
	public Student getAStudent(int id) {
		Optional<Student> studentoptional=studentrepository.findById(id);
		if(studentoptional.isPresent()) {
			Student studentfetched=studentoptional.get();
		return studentfetched;
		}else 
			throw new NotFoundException("Student not found");
	}
	public double getTotalMarksForASubject(String subjectcode) {
		double totalmarks=subjectservice.getTotalMarksForASubject(subjectcode);
		return totalmarks;
	}
	@Transactional(readOnly = true)
	public Map<String, Integer> getTotalMarksForAllSubject() {
		return null;
	}
	@Transactional(readOnly = true)
	public Map<Integer,List<Double>> getAllStudentsTotalMarksForAllSubjects(){
		List<Student> studentsWithSubjects=studentrepository.findAllWithSubjects();
		Map<Student, Set<Subject>> studentSubjectMap = studentsWithSubjects.stream()
                .collect(Collectors.toMap(student->student, Student::getSubjects));
        Map<Integer,List<Double>> eachsubjecttotalmarks = new HashMap<>();
        for(Map.Entry<Student,Set<Subject>> e:studentSubjectMap.entrySet()) {
        	Student student=e.getKey();
        	Set<Subject> subjects=e.getValue();
        	List<Double> totalmarklists=new ArrayList<Double>();
        	for(Subject subject:subjects ) {
        		double totalmarks=subject.getMark().stream().mapToDouble(x->x.getMarks())
        				.reduce(0, (total,y)->total+y);
        		totalmarklists.add(totalmarks);
        		
        	}
        	eachsubjecttotalmarks.put(student.getId(), totalmarklists);
        }
        
        return eachsubjecttotalmarks;
    }
	
	public List<Faculty> getAllFacultyName(){
		return null;
	}
	public List<Subject> getAllSubject(){
		return null;
	}
	public Student createStudent(Student s) {
		studentrepository.save(s);
		return s;
	}
	public Student updateStudent(int id, Student s)  {
		Optional<Student> studentOptional = studentrepository.findById(id);
		if(studentOptional.isPresent()) {
			Student studenttoupdate=studentOptional.get();
			studenttoupdate.setName(s.getName());
			studenttoupdate.setAddress(s.getAddress());
			Student updatedstudent=studentrepository.save(studenttoupdate);
			return updatedstudent;
		}else {
			throw new NotFoundException("Student not found");
		}
	}
	public int deleteStudent(int id) {
		return 0;
	}

}
