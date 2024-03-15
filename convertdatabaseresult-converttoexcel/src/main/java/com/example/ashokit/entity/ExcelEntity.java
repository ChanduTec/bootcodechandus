package com.example.ashokit.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ExcelEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer excelId;
	private String excelName;
	private Integer excelPages;

	public ExcelEntity(Integer excelId, String excelName, Integer excelPages) {
		super();
		this.excelId = excelId;
		this.excelName = excelName;
		this.excelPages = excelPages;
	}

	public ExcelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getExcelId() {
		return excelId;
	}

	public void setExcelId(Integer excelId) {
		this.excelId = excelId;
	}

	public String getExcelName() {
		return excelName;
	}

	public void setExcelName(String excelName) {
		this.excelName = excelName;
	}

	public Integer getExcelPages() {
		return excelPages;
	}

	public void setExcelPages(Integer excelPages) {
		this.excelPages = excelPages;
	}

	@Override
	public String toString() {
		return "ExcelEntity {excelId =" + excelId + ", excelName=" + excelName + ",excelPages=" + excelPages + "}";
	}

}
