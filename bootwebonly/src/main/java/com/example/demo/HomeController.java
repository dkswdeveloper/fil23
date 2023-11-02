package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String getHome()
	{
		System.out.println("redirecting to home");
		return "redirect:/index.html";
	}

}
