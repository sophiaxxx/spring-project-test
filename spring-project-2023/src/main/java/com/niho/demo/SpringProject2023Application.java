package com.niho.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.niho.demo", "com.niho.model", "com.niho.controller", "com.niho.service", "com.niho.repository" })
@EntityScan({ "com.niho.demo", "com.niho.model", "com.niho.controller", "com.niho.service", "com.niho.repository" })
public class SpringProject2023Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject2023Application.class, args);
	}

}