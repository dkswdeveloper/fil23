package com.dk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="student")
public class Student  // ManyTone Project
{
	@SequenceGenerator(name = "student_seq", initialValue = 3001, 
			allocationSize = 1)
	
	@TableGenerator(name="all_sequences")
	@Id
//	@GeneratedValue (strategy = GenerationType.AUTO)
//	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//by default use hibernate_sequence
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "student_seq")
//	@GeneratedValue (strategy = GenerationType.TABLE)
	private int roll;
	
	@Column(name="name")
	private String name;
	
	private Integer age;
	private String phone;
	private String email;
	private String branch;
	
//	private int projid; //in db it will be FK
//	it will create FK in student project_projid
//	@OneToOne(targetEntity = Project.class)
//	@JoinColumn(name="projid")
//	Project project;
	
	@ManyToOne
	@JoinColumn(name="projid")
	Project project;
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
				+ ", branch=" + branch + ", project=" + project + "]";
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
