package com.example.ashokit.exceptions;

public class ExceptionInformation {

	private Integer id;
	private String name;
    private String message;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ExceptionInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionInformation(Integer id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
	}
	@Override
	public String toString() {
		return "ExceptionInformation [id=" + id + ", name=" + name + ", message=" + message + "]";
	}
    
    
}
