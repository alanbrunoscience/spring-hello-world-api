package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This annotation defines that this class is a rest controller class, which will receive requests composed of URL, verb, and request body. 
@RequestMapping("/hello-world") // It defines the standard URL of the resource (e.g.: http://localhost:8080/hello-world).
public class HelloWorldController {
	
	@GetMapping // It maps GET requests sent through http://localhost:8080/hello-world.
	public String helloWorld() {
		return "Hello World!!!";
	}

}
