package com.example.UMS.Entity;

import java.util.Objects;

public class Assessment {
	private Long id;
	private String name;
	private double marks;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Assessment(Long id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Assessment() {
		super();
	}
	@Override
	public String toString() {
		return "Assessment [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assessment other = (Assessment) obj;
		return Objects.equals(id, other.id) && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	

}
