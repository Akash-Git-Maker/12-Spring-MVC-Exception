package com.akashit.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public String handleExce (Exception e) {
		
		return "Error Found";
	}

}
