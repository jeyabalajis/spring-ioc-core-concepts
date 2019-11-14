package com.jeya.spring.springcore.propertyplaceholder;

public class MyDAO {

	private String dbServer;
	
	MyDAO(String dbServer){
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "myDAO [dbServer=" + dbServer + "]";
	}
	
	
}
