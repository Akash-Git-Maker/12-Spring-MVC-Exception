package com.akashit.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public String getById(Integer id) {
		
		int i = 10/0;
		return "Mouse";
	}

}
