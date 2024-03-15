package com.example.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashokit.entity.PdfEntity;
import com.example.ashokit.repository.PdfRepository;

@Service
public class PdfService {
	@Autowired
	private PdfRepository pdfRepository;

	public void saveDatainBB() {

		ArrayList<PdfEntity> pdfData = new ArrayList<>();
		pdfData.add(new PdfEntity(123, "corejava", 280));
		pdfData.add(new PdfEntity(1, "AdvanceJava", 344));
		pdfData.add(new PdfEntity(13, "spring", 987));
		pdfData.add(new PdfEntity(23, "Sprin-boot", 667));
		pdfData.add(new PdfEntity(3, "oracle", 162));

		pdfRepository.saveAll(pdfData);

	}

	public List<PdfEntity> getAllData() {

		List<PdfEntity> findAll = pdfRepository.findAll();
		return findAll;
	}

}
