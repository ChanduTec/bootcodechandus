package com.example.ashokit.controller;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.websocket.server.PathParam;

@RestController
public class RestControllerCode {

	@GetMapping(value = "/queryy")
	public ResponseEntity<String> getdataqueryy(@RequestParam("data") String data ,@RequestParam("vals") String vals , HttpServletRequest request) {
		String queryString = request.getQueryString();
		String[] specialCharacters = queryString.split("^0-9{},[],()");
		System.out.println("My special charactiers are the");
		for (String string : specialCharacters) {
			System.out.println(string);
		}	
		String string = Arrays.toString(specialCharacters);

		return new ResponseEntity<String>(string, HttpStatus.OK);

}
	@GetMapping(value = "/path/{name}/{dsaa}")
	public String getPathParam(@PathParam("name") String name,@PathParam("dsaa") String dsaa) {

		return "welcome to the pathparam chandu velagapudi";
	}
}
