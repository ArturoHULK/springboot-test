package com.politecnica.workshops.springboottest;

import com.politecnica.workshop.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestApplication.class, args);
	}

	@Bean
	public Operation getOperation(){
		return new Operation();
	}
}
