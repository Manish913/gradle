package com.gradle.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleApplication.class, args);
	}
	@RequestMapping(value = "/hello")

	public String hello(){
		return "hello manish";
	}

	@RequestMapping(value = "/msg")

	public String getMsg(){
		return "hello to java ";
	}
}
