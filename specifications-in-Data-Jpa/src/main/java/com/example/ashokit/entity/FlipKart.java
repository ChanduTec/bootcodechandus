package com.example.ashokit.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FlipKart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer flipKartId;
	private String productName;
	private Double price;
	private String productAddress;

	public FlipKart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlipKart(Integer flipKartId, String productName, Double price, String productAddress) {
		super();
		this.flipKartId = flipKartId;
		this.productName = productName;
		this.price = price;
		this.productAddress = productAddress;
	}

	public Integer getFlipKartId() {
		return flipKartId;
	}

	public void setFlipKartId(Integer flipKartId) {
		this.flipKartId = flipKartId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProductAddress() {
		return productAddress;
	}

	public void setProductAddress(String productAddress) {
		this.productAddress = productAddress;
	}

	@Override
	public String toString() {
		return "FlipKart [flipKartId=" + flipKartId + ", productName=" + productName + ", price=" + price
				+ ", productAddress=" + productAddress + "]";
	}

}
