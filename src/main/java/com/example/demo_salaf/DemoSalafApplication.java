package com.example.demo_salaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSalafApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSalafApplication.class, args
		);
	}
	@GetMapping("/hello")
	public String hello(){
		return "Germinare Tech - Nikinho";
	}

}
