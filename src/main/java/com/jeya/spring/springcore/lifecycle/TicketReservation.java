package com.jeya.spring.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("initialize TicketReservation!");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanUp TicketReservation!");
	}

}
