package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/msg")
	public String getMessage() {

		return "Welcome To Spring Boot Application";
	}
}
