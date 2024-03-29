package com.jeya.spring.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import com.jeya.spring.springcore.innerbeans.Address;

public class University {

	private int id;
	private String name;
	private Address location;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
