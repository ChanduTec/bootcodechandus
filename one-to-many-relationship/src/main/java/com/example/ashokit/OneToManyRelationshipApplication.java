package com.example.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.ashokit.restcontroller.StudentService;

@SpringBootApplication
public class OneToManyRelationshipApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(OneToManyRelationshipApplication.class, args);
		System.out.println("I am using the One-to-Many-RelationShips");

		StudentService studentService = applicationContext.getBean(StudentService.class);
		studentService.saveData();
	}

}
