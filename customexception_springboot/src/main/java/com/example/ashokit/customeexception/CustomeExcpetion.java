package com.example.ashokit.customeexception;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CustomeExcpetion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer customExceptionId;
	private String customeMessage;
	private Double customId;

	public Integer getCustomExceptionId() {
		return customExceptionId;
	}

	public void setCustomExceptionId(Integer customExceptionId) {
		this.customExceptionId = customExceptionId;
	}

	public String getCustomeMessage() {
		return customeMessage;
	}

	public void setCustomeMessage(String customeMessage) {
		this.customeMessage = customeMessage;
	}

	public Double getCustomId() {
		return customId;
	}

	public void setCustomId(Double customId) {
		this.customId = customId;
	}

	public CustomeExcpetion(Integer customExceptionId, String customeMessage, Double customId) {
		super();
		this.customExceptionId = customExceptionId;
		this.customeMessage = customeMessage;
		this.customId = customId;
	}

	public CustomeExcpetion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomeExcpetion [customExceptionId=" + customExceptionId + ", customeMessage=" + customeMessage
				+ ", customId=" + customId + "]";
	}

}
