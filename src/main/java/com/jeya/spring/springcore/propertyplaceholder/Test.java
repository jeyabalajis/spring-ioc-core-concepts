package com.jeya.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// A test for constructor based injection where the value is read from a property file and injected. 		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jeya/spring/springcore/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) ctx.getBean("myDAO");
		
		System.out.println(dao);
	
		
	}
}
