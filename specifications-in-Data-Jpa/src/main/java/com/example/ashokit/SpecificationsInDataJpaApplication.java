package com.example.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.ashokit.service.FlipKartService;

@SpringBootApplication
@EnableJpaRepositories
public class SpecificationsInDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpecificationsInDataJpaApplication.class, args);
		System.out.println("Welcomr to the data specifications");
		FlipKartService flipKartService = applicationContext.getBean(FlipKartService.class);
	
		
		flipKartService.getProductsSpec(null, 20000.00, 50000.00);
	}

}
