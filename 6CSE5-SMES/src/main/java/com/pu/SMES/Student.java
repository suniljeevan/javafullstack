package com.pu.SMES;
import javax.persistence.*;
@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="id")
	private int sid;
	@Column(name="name")
	private String sname;
	@Column(name="cgpa")
	private double scgpa;
	//generate getter setter
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getScgpa() {
		return scgpa;
	}
	public void setScgpa(double scgpa) {
		this.scgpa = scgpa;
	}
	//generate constructor
	/**
	 * @param sid
	 * @param sname
	 * @param scgpa
	 */
	public Student(int sid, String sname, double scgpa) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scgpa = scgpa;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scgpa=" + scgpa + "]";
	}
	

}
