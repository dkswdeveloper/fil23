package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
//	@Query(value = "select s from Student s where s.name=:name")
	List<Student> findByName(String name);
	
	List<Student> findByEmail(String email);
	
	List<Student> findByEmailIsNull();
	
	
	
}
