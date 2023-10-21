package com.dk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
//	@GeneratedValue (strategy = GenerationType.IDENTITY)
//	@GeneratedValue (strategy = GenerationType.SEQUENCE)
//	@GeneratedValue (strategy = GenerationType.TABLE)
	private int roll;
	@Column(name="name")
	private String name;
	
	private Integer age;
	private String phone;
	private String email;
	
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
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
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
}
