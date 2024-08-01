package com.akashit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	

	@GetMapping("/get")
	public String getWish () {
		int i = 10/0;
		return "UserController Error Found";
	} 

}
