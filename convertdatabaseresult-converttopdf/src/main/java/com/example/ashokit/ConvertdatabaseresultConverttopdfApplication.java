package com.example.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.ashokit.service.PdfService;

@SpringBootApplication
public class ConvertdatabaseresultConverttopdfApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(ConvertdatabaseresultConverttopdfApplication.class, args);
		System.out.println("I am converting to the PDF data");
		PdfService pdfService = context.getBean(PdfService.class);
		pdfService.saveDatainBB();

	}

}
