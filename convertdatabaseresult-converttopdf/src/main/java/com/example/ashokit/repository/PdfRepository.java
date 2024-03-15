package com.example.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ashokit.entity.PdfEntity;

@Repository
public interface PdfRepository  extends JpaRepository<PdfEntity, Serializable>{
	
	

}
