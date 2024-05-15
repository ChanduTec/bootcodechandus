package com.example.ashokit.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerClass {

	@ExceptionHandler(value = ProductNotFoundClass.class)
	public ResponseEntity<ExceptionInformation> handleProductIdNotFound(ProductNotFoundClass productNotFoundClass) {
		ExceptionInformation information = new ExceptionInformation();
		information.setId(21332);
		information.setMessage("Sorry no id found");
		information.setName("Data issue");

		return new ResponseEntity<ExceptionInformation>(information, HttpStatus.BAD_REQUEST);
	}
}
