package com.example.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ashokit.entity.ExcelEntity;

@Repository
public interface ExcelRepository extends JpaRepository<ExcelEntity, Serializable> {

}
