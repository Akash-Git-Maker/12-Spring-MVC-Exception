package com.akashit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akashit.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@GetMapping("/product")
	public String getId () {
		service.getById(100);
		return "ProductController";
	}

}
