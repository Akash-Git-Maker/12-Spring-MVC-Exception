package com.akashit.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	
	@GetMapping("/hi")
	public String getMsg () {
		return "Good Morning Babe";
	}
	
	
	@GetMapping("/hello")
	public String getWish () {
		int i = 10/0;
		return "Good Evening";
	}
	
	
}
