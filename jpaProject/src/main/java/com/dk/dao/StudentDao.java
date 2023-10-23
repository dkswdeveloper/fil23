package com.dk.dao;

import java.util.List;

import com.dk.model.Student;

public interface StudentDao {
	Student findById(int roll);
	List<Student> findAll();
	Student save(Student student);

}
