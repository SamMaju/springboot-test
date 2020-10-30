package com.test.springboottest.controlllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		System.out.println("in controller");
		return "In Swagger Hello World";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/try1")
	public String sayHi() {
		System.out.println("in controller");
		return "In sayHi() ";
	}
	
	
	@RequestMapping("/test")
	public String sayNamsakar() {
		System.out.println("in controller");
		return "Namaskar ";
	}
	
	@RequestMapping("/")
	public String boloNamsakar() {
		System.out.println("in controller");
		return "Namaskar ";
	}
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}


