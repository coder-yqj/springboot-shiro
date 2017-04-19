package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootShiroApplication.class, args);
	}
}
