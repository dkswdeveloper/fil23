package com.example.demo.model;

public class Student  // ManyTone Project
{
	private int roll;
	
	private String name;
	
	private Integer age;
	private String phone;
	private String email;
	private String branch;
	
	
	public Student(int roll, String name, Integer age, String phone) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email
				+ ", branch=" + branch + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
