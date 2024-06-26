package com.sahoo.JPAMAPPINGExample.Entities;
import javax.persistence.*;
/*  use mysql to create Department table after HOD table creation
 * create table Department(departmentid_PK int primary key,
 *  departmentname varchar(20) not null, hod_fk int,
 *  foreign key(hod_fk) references Hod(hodid_pk));
 */
@Entity
@Table(name="Department")
public class Department {
	@Id	
	@Column(name="departmentid_PK")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer departmentid;
	@Column(name="departmentname", nullable=false)
	private String departmentname;
	@OneToOne(mappedBy = "department", cascade = CascadeType.ALL)
  //FOREIGN KEY AUTOMATICALLY ADDED BY HIBERNATE IN 1 TO 1
  	//but in case we want to add foreign key explicitly, we can use
  	private HOD hod;
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public HOD getHod() {
		return hod;
	}
	public void setHod(HOD hod) {
		this.hod = hod;
	}
	public Department(Integer departmentid, String departmentname, HOD hod) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.hod = hod;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname + ", hod=" + hod + "]";
	}


}
