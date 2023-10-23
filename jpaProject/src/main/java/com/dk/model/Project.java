package com.dk.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proj_seq")
	private int projid;
	private String title;
	private String technologies;
	//many is alwasys called "CHILD TABLE" it contains Forgn Key
	//Assumption is in table student fk name is project_projid 
//	@JoinColumn (in my table what is name of foreign key not possible)

	@OneToMany(mappedBy = "project",fetch = FetchType.EAGER)
//	@OneToMany(mappedBy = "project",fetch = FetchType.LAZY)
	private List<Student> students = new ArrayList<>();
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Project() {
		super();
	}
	public Project(int projid, String title, String technologies) {
		super();
		this.projid = projid;
		this.title = title;
		this.technologies = technologies;
	}
	public int getProjid() {
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	@Override
	public String toString() {
		return "Project [projid=" + projid + ", title=" + title + ", technologies=" + technologies + "]";
	}
}

/*
 * Event table eventid, name, type, eventdate
 * one to many 
 * many to one 
 * fetch a student and event participated in 
 * fetch an event and the students in participating in that event
 */










