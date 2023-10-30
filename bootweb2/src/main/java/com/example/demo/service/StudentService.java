package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	Student getStudent(int sid);
	List<Student> getAll();
	Student addStudent(Student student);
	List<Student> getAllByName(String name);

}
