package com.example.UMS.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String subjectCode;
	private String subjectName;
	private int credit;
	private List<Assessment> mark;
	private List<Faculty> faculties;
	@ManyToMany(mappedBy="subjects")
	private Set<Student> students=new HashSet<Student>();
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public List<Assessment> getMark() {
		return mark;
	}
	public void setMark(List<Assessment> mark) {
		this.mark = mark;
	}
	public List<Faculty> getFaculties() {
		return faculties;
	}
	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}
	public Subject(String subjectCode, String subjectName, int credit, List<Assessment> mark, List<Faculty> faculties,
			Set<Student> students) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.credit = credit;
		this.mark = mark;
		this.faculties = faculties;
		this.students = students;
	}
	public Subject() {
		super();
	}
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit + ", mark="
				+ mark + ", faculties=" + faculties + ", students=" + students + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(credit, faculties, mark, students, subjectCode, subjectName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return credit == other.credit && Objects.equals(faculties, other.faculties) && Objects.equals(mark, other.mark)
				&& Objects.equals(students, other.students) && Objects.equals(subjectCode, other.subjectCode)
				&& Objects.equals(subjectName, other.subjectName);
	}
	
}
