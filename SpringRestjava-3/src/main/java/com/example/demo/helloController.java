package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController

public class helloController {
	@RequestMapping("/hello")
	public String sayHelloWorld() {
		return"<h1> HelloWorld <h1>";
	}
	}

