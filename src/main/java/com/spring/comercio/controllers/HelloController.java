package com.spring.comercio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/helloMundo")
	public String hello(){	
		
		return "Olá Mundo!";
	}
}
