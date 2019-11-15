package com.jeya.spring.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jeya/spring/springcore/stereotype/annotations/config.xml");

		Instructor ins = (Instructor) context.getBean("instructor");

		System.out.println(ins);
	}

}
