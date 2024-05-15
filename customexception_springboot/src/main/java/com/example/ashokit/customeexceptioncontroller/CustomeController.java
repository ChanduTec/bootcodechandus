package com.example.ashokit.customeexceptioncontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashokit.customeexception.CustomeExcpetion;
import com.example.ashokit.customeexceptionservice.CustomService;

@RestController
public class CustomeController {

	@Autowired
	private CustomService customService;

	@PostMapping(value = "/saveData")
	public ResponseEntity<CustomeExcpetion> customSaveData(@RequestBody CustomeExcpetion customeExcpetion) {
		CustomeExcpetion saveData = customService.saveData(customeExcpetion);
		return new ResponseEntity<CustomeExcpetion>(saveData, HttpStatus.CREATED);
	}

	@GetMapping(value = "/databyId/{id}")
	public ResponseEntity<CustomeExcpetion> getDataById(@PathVariable("id") Integer id) {
		CustomeExcpetion dataById = customService.getDataById(id);
		return new ResponseEntity<CustomeExcpetion>(dataById, HttpStatus.OK);

	}

	@GetMapping(value = "/alldata")
	public ResponseEntity<List<CustomeExcpetion>> getAllData() {

		List<CustomeExcpetion> allData = customService.getAllData();
		return new ResponseEntity<List<CustomeExcpetion>>(allData, HttpStatus.OK);
	}
}
