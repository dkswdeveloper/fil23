package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student getStudent(int sid) {
		Optional<Student> optional = studentRepository.findById(sid);
		if( ! optional.isPresent() )
			throw new RuntimeException("student with id " + sid + " not found");
		return optional.get();
	}

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public Student addStudent(Student student) {
//		em.getTransaction().begin();

		Student saved = studentRepository.save(student);
		return saved;

		//		em.getTransaction().commit();
//		catch() { em.getTransaciton.rollback(); }
	}

	@Override
	public List<Student> getAllByName(String name) {
		return studentRepository.findByName(name);
	}

}
