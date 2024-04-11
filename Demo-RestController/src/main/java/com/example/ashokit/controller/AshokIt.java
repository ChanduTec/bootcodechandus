package com.example.ashokit.controller;

public class AshokIt {

	private Integer id;
	private String name;
	private String gmail;

	public AshokIt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AshokIt(Integer id, String name, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
	}

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

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	@Override
	public String toString() {
		return "AshokIt [id=" + id + ", name=" + name + ", gmail=" + gmail + "]";
	}

}
