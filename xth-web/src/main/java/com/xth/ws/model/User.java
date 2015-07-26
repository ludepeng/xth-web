package com.xth.ws.model;

import java.util.List;

import org.apache.cxf.aegis.type.java5.XmlElement;

public class User {
	private String userName;

	private String password;

	private List<String> cars;

	private MapParam books;

	@XmlElement(name = "userName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@XmlElement(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElement(name = "cars")
	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}

	@XmlElement(name = "books")
	public MapParam getBooks() {
		return books;
	}

	public void setBooks(MapParam books) {
		this.books = books;
	}

}
