package com.jeya.spring.springcore.reftypes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Scores {
	private Double maths;
	private Double physics;
	private Double chemistry;

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}

	@PostConstruct
	public void hi() {
		System.out.println("hi there Scores!");
	}

	@PreDestroy
	public void bye() {
		System.out.println("bye bye Scores!");
	}
}