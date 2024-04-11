package com.example.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestControllerApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoRestControllerApplication.class);

	public static void main(String[] args) {
		logger.info("i am inside the main method");
		SpringApplication.run(DemoRestControllerApplication.class, args);
		System.out.println("Welcome to the rest controller");
		logger.info("i am outside the main method");
	}

}
