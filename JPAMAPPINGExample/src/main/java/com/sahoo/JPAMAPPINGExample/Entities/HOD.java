package com.sahoo.JPAMAPPINGExample.Entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*  use mysql to create Department table 
 * create table HOD(hodid_PK int primary key,
 *  hodname varchar(20) not null);
 *  
 *  use the following alter command after creation of 
 *  Department table in mysql
 *  
 *  ALTER TABLE HOD ADD DEPTID INT;
 *  
 *  ALTER TABLE HOD 
ADD CONSTRAINT `fk_department` 
FOREIGN KEY (DEPTID)
REFERENCES Department(departmentid_pk)
ON DELETE SET NULL
ON UPDATE SET NULL;
 *    
 */
@Entity
@Table(name="HOD")
public class HOD {
	@Id	
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hodid_PK")
	private Integer hodid;
	@Column(name="hodname", nullable=false)
	private String hodname;
	@OneToOne(fetch=FetchType.LAZY) //LAZY for 1-m, and m-n
	@JoinColumn(name = "deptid")
	private Department department;
	public Integer getHodid() {
		return hodid;
	}
	public void setHodid(Integer hodid) {
		this.hodid = hodid;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "HOD [hodid=" + hodid + ", hodname=" + hodname + ", department=" + department + "]";
	}
	public HOD() {
		super();
	}
	public HOD(Integer hodid, String hodname, Department department) {
		super();
		this.hodid = hodid;
		this.hodname = hodname;
		this.department = department;
	}




}
