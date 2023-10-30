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
	
	/*
	 * url : https://paytm.com/9898989865/account
	 * https://paytm.com/9898989865/customers : all in json
	 * https://paytm.com/9898989865/customers/{id}
	 * GET , POST, PUT DEELTE, PATCH, 
	 * POST : CREATE NEW RESOURCE AT SERVER
	 * PUT : UPDATE THE RESOURCE AT SERVER
	 * PATCH : UPDATE PART OF RESOURCE
	 * DELETE : DELETE THE RESOURCE
	 * 
	 */
	
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
