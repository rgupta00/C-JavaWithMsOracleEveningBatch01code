package com.productapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${data.value}")
	private String value;
	
	@GetMapping(path="value")
	public String printValue() {
		return value;
	}

}
