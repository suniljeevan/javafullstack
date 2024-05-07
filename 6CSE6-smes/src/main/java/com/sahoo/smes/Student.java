package com.sahoo.smes;
import javax.persistence.*;
@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="regdno")
	private String regdno;
	@Column(name="name")
	private String name;
	@Column(name="cgpa")
	private double cgpa;
	@Column(name="semester")
	private int semester;
//generate getter and setter
	public String getRegdno() {
		return regdno;
	}
	public void setRegdno(String regdno) {
		this.regdno = regdno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
//generate constructors
	public Student(String regdno, String name, double cgpa, int semester) {
		super();
		this.regdno = regdno;
		this.name = name;
		this.cgpa = cgpa;
		this.semester = semester;
	}
public Student() {
	super();
}
	
}





