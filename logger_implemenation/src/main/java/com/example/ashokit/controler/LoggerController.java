package com.example.ashokit.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

	Logger logger = LoggerFactory.getLogger(LoggerController.class);

	@GetMapping(value = "/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		logger.info("I am inside the getWelcomeMsg");
		return new ResponseEntity<String>("welcome", HttpStatus.OK);
	}

	@GetMapping(value = "/hello")
	public ResponseEntity<String> getHelloMsg() {
		logger.info("I am inside the getHelloMsg");
		return new ResponseEntity<String>("hello", HttpStatus.OK);
	}

	@GetMapping(value = "/hi")
	public ResponseEntity<String> getHiMsg() {
		logger.info("I am inside the getHiMsg");
		return new ResponseEntity<String>("hi", HttpStatus.OK);
	}
}
