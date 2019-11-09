package com.jeya.spring.springcore.reftypes;

public class Student {

	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}
	
	@Override
	public String toString() {
		return "Student [scores=" + scores + "]";
	}

	public void hi() {
		System.out.println("hi there Student!");
	}

	public void bye() {
		System.out.println("bye bye Student!");
	}
}
