package com.example.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureksserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureksserverApplication.class, args);
		System.out.println("Working with the eureka server");
	}

}
