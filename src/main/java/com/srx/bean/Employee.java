package com.srx.bean;

import java.util.Set;

public class Employee {

	private Integer id;
	private String lastName;
	private String email;
	private Integer gender;
	private Set<String> hobby;
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String lastName, String email, Integer gender, Set<String> hobby) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email =email;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	public Set<String> getHobby() {
		return hobby;
	}

	public void setHobby(Set<String> hobby) {
		this.hobby = hobby;
	}

	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailString() {
		return email;
	}
	public void setEmailString(String email) {
		this.email =email;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ",email=" +email
				+ ", gender=" + gender + ", hobby=" + hobby + "]";
	}

	
}
