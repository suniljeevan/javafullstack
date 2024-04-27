package com.sahoo.FMS.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="presidencyfaculty")
public class Faculty {
	@Id
	@Column(name="fid")
   // @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private String fid;
	@Column(name="fname")
	private String name;
	@Column(name="designation")
	private String designation;
	@Column(name="course")
    private String course;
	//generate getter setter, constructor
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Faculty(String fid, String name, String designation, String course) {
		super();
		this.fid = fid;
		this.name = name;
		this.designation = designation;
		this.course = course;
	}
	public Faculty() {
		super();
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", name=" + name + ", designation=" + designation + ", course=" + course + "]";
	}
	
	
}






