package com.niho.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@RequestMapping("/hello")
	public String hello(){
		return "Hey, Spring Boot 的 Hello World !";
	}
	
	@RequestMapping("/index")
	public String login(){
		return "index";
	}
	
	@GetMapping("/index")
	public String login2(){
		return "index";
	}

}
