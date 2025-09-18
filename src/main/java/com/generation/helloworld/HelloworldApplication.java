package com.generation.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication: Annotation to initialize a series of default configurations in Spring Boot projects 
// (interpreted by the compiler, frameworks or tools during runtime or compilation.)
@SpringBootApplication 
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args); // Initializes the application by executing the application's Main Class (e.g.: HelloworldApplication.java)
	}

}
