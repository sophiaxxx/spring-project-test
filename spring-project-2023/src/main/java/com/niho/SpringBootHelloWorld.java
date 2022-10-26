package com.niho;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@RequestMapping("/")
	public String hello(){
		return "Hey, Spring Boot's Hello World ! ";
	}
}
