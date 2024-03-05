package com.example.UMS.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UMS.Entity.Faculty;
import com.example.UMS.Entity.Subject;
import com.example.UMS.Exception.NotFoundException;
import com.example.UMS.Repository.SubjectRepository;

import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectRepository subjectrepository;
	public List<Subject> getAllSubjects(){
		return null;
	}
	public Subject getASubject(int id) {
		return null;
	}
	public double getTotalMarksForASubject(String subjectcode) {
		Optional<Subject> subject=subjectrepository.findById(subjectcode);
		if(subject.isPresent()) {
			Subject subjectfound=subject.get();
		double sum=	subjectfound.getMark().stream().mapToDouble(x->x.getMarks()).reduce(0,(total,y)->total+y);
			return sum;
		}else 
			throw new NotFoundException("Subject Not Found");
		
	}
	public Map<String, Integer> getTotalMarksForAllSubject(){
		return null;
	}
	public Map<Integer, Integer> getAllStudentsTotalMarksForAllSubjects(){
		return null;
	}
	public List<Faculty> getAllFacultyName(){
		return null;
	}
	public Subject createSubject(Subject s) {
		subjectrepository.save(s);
		return s;
	}
	public Subject updateSubject(String id,Subject s) {
		Optional<Subject> optionalsubject=subjectrepository.findById(id);
		if(optionalsubject.isPresent()) {
			Subject subjectupdated=optionalsubject.get();
		return subjectupdated;
		}else
			throw new NotFoundException("Subject Not Found");
	}
	public int deleteSubject(int id) {
		return 0;
	}
}
