package com.pu;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String regdno;
	private String name;
	private double cgpa;
	@Autowired
	private Address address;
	//generate getter and setter
	
	public String getRegdno() {
		return regdno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	//generate constructor
	public Student(String regdno, String name, double cgpa, Address address) {
		super();
		this.regdno = regdno;
		this.name = name;
		this.cgpa = cgpa;
		this.address = address;
	}
	public Student() {
		super();
	}
	
	

}
