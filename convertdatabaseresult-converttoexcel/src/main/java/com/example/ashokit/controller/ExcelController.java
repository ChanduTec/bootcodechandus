package com.example.ashokit.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashokit.entity.ExcelEntity;
import com.example.ashokit.service.ExcelService;
import com.example.ashokit.userexcelexporter.UserExcelExporter;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ExcelController {
	@Autowired
	private ExcelService excelService;

	@GetMapping(value = "excel")
	public String welcome() {
		return "welcome to the excel chandu";
	}

	@PostMapping(value = "/save")
	public ResponseEntity<ExcelEntity> saveData(@RequestBody ExcelEntity excelEntity) {
		excelService.saveData(excelEntity);
		System.out.println("Data is saved");
		System.out.println(excelEntity);
		return new ResponseEntity<ExcelEntity>(HttpStatus.CREATED);
	}

	@GetMapping(value = "/getData")
	public ResponseEntity<List<ExcelEntity>> getAllData() {
		List<ExcelEntity> getallData = excelService.getallData();
		return new ResponseEntity<List<ExcelEntity>>(getallData, HttpStatus.OK);

	}

	@GetMapping("/users/export/excel")
	public void exportToExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
		response.setHeader(headerKey, headerValue);

		List<ExcelEntity> listUsers = excelService.getallData();

		UserExcelExporter excelExporter = new UserExcelExporter(listUsers);

		excelExporter.export(response);
	}

}
