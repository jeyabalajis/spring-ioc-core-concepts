package com.jeya.spring.springcore.innerbeans;

public class Employee {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private int id;
	private String name;
	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
