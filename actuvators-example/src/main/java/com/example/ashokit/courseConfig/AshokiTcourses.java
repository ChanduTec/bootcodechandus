package com.example.ashokit.courseConfig;

import org.springframework.stereotype.Component;

@Component
public class AshokiTcourses {

	private Integer courseId;
	private String courseName;
	private Double courseFee;
	
	public AshokiTcourses() {
		
	}

	public void add() {
		System.out.println("I am inside the add()");
		System.out.println(courseId + " " + courseName + " " + courseFee);
		data(12,"java",9999.99);
	}

	public static void data(Integer courseId, String courseName, Double courseFee) {
		System.out.println(courseName);
		System.out.println(courseId);
		System.out.println(courseFee);
		System.out.println("I am insdie the data()");
		System.out.println(new AshokiTcourses().courseName);
		System.out.println(new AshokiTcourses().courseFee);
		System.out.println(new AshokiTcourses().courseId);
	}
}
