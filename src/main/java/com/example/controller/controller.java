package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/")
	public String Message() {
		return "<h1>Spring Boot application on the Cloud is Deployed Successfully</h1>";
	}
}