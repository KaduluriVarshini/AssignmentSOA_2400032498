package com.klef.soa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingCompetitionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingCompetitionServiceApplication.class, args);
		System.out.println("Crud Service is Running");
	}

}
