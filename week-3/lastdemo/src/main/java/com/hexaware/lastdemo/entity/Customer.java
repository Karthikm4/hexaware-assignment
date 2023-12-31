package com.hexaware.lastdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private int Id;
	private String name;
	private int age;
	
	
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, int age) {
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
