package Sahoo.Entities;

import java.util.Objects;

class Student {
private int id;
private String name;
private double cgpa;
// alt shift s
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public Student(int id, String name, double cgpa) {
	super();
	this.id = id;
	this.name = name;
	this.cgpa = cgpa;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
}
@Override
public int hashCode() {
	return Objects.hash(cgpa, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && id == other.id
			&& Objects.equals(name, other.name);
}

}