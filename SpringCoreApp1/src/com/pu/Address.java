package com.pu;
public class Address {
	private String parentname;
	private String state;
	private String country;
	private long pin;
	//generate getter setter
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	//generate constructor
	public Address(String parentname, String state, String country, long pin) {
		super();
		this.parentname = parentname;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	public Address() {
		super();
	}
	

}
