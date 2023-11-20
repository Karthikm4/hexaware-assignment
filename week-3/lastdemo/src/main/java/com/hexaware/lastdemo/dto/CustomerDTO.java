package com.hexaware.lastdemo.dto;

import jakarta.validation.constraints.NotBlank;

public class CustomerDTO {
	private int Id;
	@NotBlank(message = "Name should not be null")
	private String name;
	private int age;
	
	
	
	public CustomerDTO() {
		super();
	}

	public CustomerDTO(int id, String name, int age) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
