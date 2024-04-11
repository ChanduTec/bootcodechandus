package com.example.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class DemoRestController {

	private static Logger logger = LoggerFactory.getLogger(DemoRestController.class);

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome(@RequestParam("well") String well) {
		logger.info("i am inside the getWelcome");
		return new ResponseEntity<String>("welcoe to getWelcome()", HttpStatus.OK);
	}

	@GetMapping("/hai/{hii}")
	public ResponseEntity<String> gethi(@PathParam("hii") String hii) {
		logger.info("i am inside the gethi");
		return new ResponseEntity<String>("welcoe to gethi()", HttpStatus.OK);
	}

	@GetMapping(value = "/jsondata",produces = "application/xml")
	public ResponseEntity<AshokIt> convertJson() {
		logger.info("i am inside the convertJson");
		AshokIt ashokIt = new AshokIt(123, "Ramesh", "ramesh123@gmail.com");
		return new ResponseEntity<AshokIt>(ashokIt, HttpStatus.OK);
	}

	@GetMapping(value = "listofjson", produces = "application/xml")
	public ResponseEntity<List<AshokIt>> listofAshokItJson() {
		System.out.println("I am inside the listofAshokItJson");
		logger.info("I am inside the listofAshokItJson");
		AshokIt ashokIt = new AshokIt(123, "Ramesh", "ramesh123@gmail.com");
		AshokIt ashokIt2 = new AshokIt(3, "Chandu", "Chandu123@gmail.com");
		AshokIt ashokIt3 = new AshokIt(12, "Bargav", "Bargav123@gmail.com");
		logger.info("I am outside the listofAshokItJson");
		System.out.println("I am outside the listofAshokItJson");
		return new ResponseEntity<List<AshokIt>>(Arrays.asList(ashokIt, ashokIt2, ashokIt3), HttpStatus.OK);
	}
}
