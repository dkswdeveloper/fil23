package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example", "com.dk", "com.msg"})
public class Bootweb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bootweb2Application.class, args);
	}

}
