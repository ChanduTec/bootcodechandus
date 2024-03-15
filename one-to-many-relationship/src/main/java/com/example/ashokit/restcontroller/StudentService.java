package com.example.ashokit.restcontroller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashokit.entity.Courses;
import com.example.ashokit.entity.Student;
import com.example.ashokit.repository.CoursesRepository;
import com.example.ashokit.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentReposi;
	@Autowired
	private CoursesRepository coursesReposit;

	private StudentService(StudentRepository studentService, CoursesRepository coursesRepository) {
		this.studentReposi = studentService;
		this.coursesReposit = coursesRepository;

	}

	public void saveData() {

		Student student = new Student();
		student.setStudentAddress("Pune");
		student.setStudentName("Chandu");

		Courses courses = new Courses();
		courses.setCoursefee(13455.66);
		courses.setCousrseName("spring");
		courses.setStudent(student);

		courses.setCoursefee(54678.66);
		courses.setCousrseName("DataBases");
		courses.setStudent(student);

		student.setCourses(Arrays.asList(courses));

		studentReposi.save(student);

		System.out.println(student);
		System.out.println(courses);

	}

}
