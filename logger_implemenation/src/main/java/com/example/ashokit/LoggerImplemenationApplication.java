package com.example.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerImplemenationApplication {
	private static Logger logger = LoggerFactory.getLogger(LoggerImplemenationApplication.class);

	public static void main(String[] args) {
		logger.info("I am inside the application class");
		SpringApplication.run(LoggerImplemenationApplication.class, args);
		logger.info("My main method is executed");
	}

}
