package com.shashir.springbootopenshifthelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootOpenshiftHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOpenshiftHelloworldApplication.class, args);
	}

	@GetMapping
	public String display() {
		return "<h1>Welcome to Openshift ...!</h1>";
	}
}
