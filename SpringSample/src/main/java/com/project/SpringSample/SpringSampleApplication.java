package com.project.SpringSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringSampleApplication {

	@GetMapping("/getMessage")
	public String message() {
		return "yay!! its ready....";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}

}
