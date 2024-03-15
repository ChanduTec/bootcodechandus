package com.example.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ashokit.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Serializable> {

}
