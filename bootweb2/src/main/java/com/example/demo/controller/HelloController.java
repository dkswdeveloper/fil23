package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@Controller
public class HelloController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String helloPage()
	{
		Optional<Student> optStudent = studentRepository.findById(123);
		Student std = optStudent.orElse(null);
		String str = "" + std;
		return "<h1> Hello Everyone !!!!</h1><h2> " + str + "</h2>";
	}
	
	

}
