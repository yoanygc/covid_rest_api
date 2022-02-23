package org.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidBuzzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidBuzzerApplication.class, args);
	}

	
}
