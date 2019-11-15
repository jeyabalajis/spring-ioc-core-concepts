package com.jeya.spring.springcore.stereotype.annotations;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int id;
	String name;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}

}
