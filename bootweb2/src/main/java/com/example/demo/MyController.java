package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class MyController {
	private static Logger log = LoggerFactory.getLogger("com.example.demo");
//	slf4j : Simple Logging Framework for Java API 
//	log4j Logger , log4j-slf4j
//	java utility logging Logger utiltiy to slf4j 
//	logback Logger logback to slf4j
//	log4j2 Logger
	
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String getHome(HttpServletRequest request, HttpServletResponse response)
	{
		log.debug("request for home page");
//		request.getRequestDispatcher("index.jsp").forward(request, response);
		return "index";
	}
	
	@ResponseBody
	@GetMapping("/profile")
	public String getProfile()
	{
		return "profile";
	}
	@ResponseBody
	@PostMapping("/addemployee")
	public String addEmployee()
	{
		return "added new employee";
	}
	@ResponseBody
	@RequestMapping(path = "/deleteemp", method = RequestMethod.GET)
	public String deleteEmployee()
	{
		return "employee deleted";
	}
//	@ResponseBody
	@GetMapping("/student")
	public String getStudent(ModelMap model, HttpServletRequest request)
	{
		log.debug("request for student");
		String sidStr = request.getParameter("sid");
		Integer sid = Integer.parseInt(sidStr);
		
		model.put("student", new Student(12349, "Dummy", 100, "00000000"));
		return "showstudent";
	}
	@GetMapping("/studentSpring")
	public String getStudentSprint(ModelMap model, 
			@RequestParam(name = "sid", required = false) Integer sid)
	{
		int s = sid == null?0:sid;
		model.put("student", new Student(s, "Dummy", 100, "00000000"));
		return "showstudent";
	}
	@GetMapping("/studentSpring/{pathsid}")
	public String getStudentSpringPath(ModelMap model, 
			@PathVariable("pathsid") int sid, 
			@RequestHeader("connection") String connection,
			@RequestHeader("user-agent") String useragent,
			@CookieValue(name="jsessid", required = false) String jsessionid)
	{
		log.info(connection + "," + useragent + "," + jsessionid);
		Student student = studentService.getStudent(sid);
		model.put("student", student);
		return "showstudent";
	}
	@GetMapping("/students")
	@ResponseBody
	public List<Student> findAll()
	{
		return studentService.getAll();
	}
	@ResponseBody
	@GetMapping("/allparams")
	public String getAllParams(ModelMap model, 
			@RequestParam Map<String,String> paramMap)
	{
		return paramMap.toString();
		
	}
	
	
	

}
