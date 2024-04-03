package com.example.ashokit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.ashokit.courseConfig.AshokiTcourses;

@Configuration
public class ChanduConfigration {

	private Integer age;
	private String name;
	private Double salary;
	@Autowired
	private AshokiTcourses aa;

	public ChanduConfigration() {
		System.out.println("I am inside the ChanduConfigration()");
		age = 22;
		name = "chandu";
		salary = 23243.43;
		System.out.println(age + "  " + name + " " + salary);

	
	}

	public void dd() {
		System.out.println("I am inside the dd()");
		// ashokiTcourses.add();
		aa.add();
		aa.data(213, "MyJava", 342.342);
	}
}
