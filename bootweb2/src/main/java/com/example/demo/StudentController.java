package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	StudentService studentService;
	@Autowired
	StudentRepository studentRepository;
	
	
	@GetMapping(path = "/students",produces = "application/json")
	public List<Student> findAll()
	{
		return studentService.getAll();
	}

	@GetMapping(path = "/students/{sid}", produces = "application/json")
	public Student find(@PathVariable("sid") int sid)
	{
		return studentService.getStudent(sid);
	}
	@PostMapping(path="/students", consumes = "application/json", 
			produces = "application/json")
	public Student addStudent(@RequestBody Student student)
	{
		log.info("student post request " + student);
		return student;
	}
	@PutMapping(path="/students", consumes = "application/json", 
			produces = "application/json")
	public Student editStudent(@RequestBody Student student)
	{
		log.info("student post request");
		return student;
	}
	@PatchMapping(path="/students", consumes = "application/json", 
			produces = "application/json")
	public Student pathStudent(@RequestBody Student student)
	{
		log.info("student post request");
		return student;
	}
	@GetMapping("/students/name/{name}")
	List<Student> findAllByName(@PathVariable("name") String name)
	{
		return studentService.getAllByName(name);
	}
//	@ExceptionHandler(Exception.class)
//	@ResponseStatus(code = HttpStatus.NOT_FOUND)
//	public String handleException(Exception e)
//	{
//		return e.getMessage();
//	}

}
