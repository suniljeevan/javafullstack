package com.sahoo.JPAMAPPINGExample.Entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HOD")
public class HOD {
	@Id	
	@Column(name="hodid_PK")
	@GeneratedValue
	private Integer hodid;
	@Column(name="hodname", nullable=false)
	private String hodname;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER) 
	//LAZY for 1-m, and m-n
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
	public HOD(Integer hodid, String hodname, Department department) {
		super();
		this.hodid = hodid;
		this.hodname = hodname;
		this.department = department;
	}
	public HOD() {
		super();
	}
	@Override
	public String toString() {
		return "HOD [hodid=" + hodid + ", hodname=" + hodname + ", department=" + department + "]";
	}




}
