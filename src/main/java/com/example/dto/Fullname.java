package com.example.dto;

public class Fullname {
	private String firstname;
	private String middlename;
	private String lastname;
	
	public Fullname(String firstname, String middlename, String lastname)
	{
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
