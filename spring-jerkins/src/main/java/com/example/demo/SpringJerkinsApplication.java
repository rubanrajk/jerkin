package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJerkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJerkinsApplication.class, args);
	}
@RequestMapping("/path")
public String getMessage() {
	
	return "Hello";
}
}
