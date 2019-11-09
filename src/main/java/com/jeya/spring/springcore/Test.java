package com.jeya.spring.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeya.spring.springcore.lifecycle.TicketReservation;
import com.jeya.spring.springcore.map.Customer;
import com.jeya.spring.springcore.reftypes.Student;
import com.jeya.spring.springcore.shopping.ShoppingCart;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = (Employee) ctx.getBean("emp");
		
		Customer customer = (Customer) ctx.getBean("customer");
		
		
		Student student = (Student) ctx.getBean("student");
		
		ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingCart");

		TicketReservation ticketReservation = (TicketReservation) ctx.getBean("ticketReservation");
		
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
		
		System.out.println(customer);
		
		System.out.println(student);
		
		System.out.println(shoppingCart);
		
		System.out.println(ticketReservation);
		
		ctx.registerShutdownHook();
		
	}

}
