package com.jeya.spring.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeya.spring.springcore.dependencycheck.Prescription;
import com.jeya.spring.springcore.dependencycheck.University;
import com.jeya.spring.springcore.innerbeans.Employee;
import com.jeya.spring.springcore.lifecycle.TicketReservation;
import com.jeya.spring.springcore.map.Customer;
import com.jeya.spring.springcore.reftypes.Student;
import com.jeya.spring.springcore.shopping.ShoppingCart;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Employee employee = (Employee) ctx.getBean("employee");
		
		Employee employee2 = (Employee) ctx.getBean("employee");
		
		Customer customer = (Customer) ctx.getBean("customer");
		
		
		Student student = (Student) ctx.getBean("student");
		
		ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingCart");

		TicketReservation ticketReservation = (TicketReservation) ctx.getBean("ticketReservation");
		
		
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		
		
		University university1 = (University) ctx.getBean("university");
		University university2 = (University) ctx.getBean("university");
		
		System.out.println(employee.hashCode());		
		System.out.println(employee2.hashCode());

		
		System.out.println(university1.hashCode());		
		System.out.println(university2.hashCode());
		
		System.out.println(customer);
		
		System.out.println(student);
		
		System.out.println(shoppingCart);
		
		System.out.println(ticketReservation);
		
		System.out.println(prescription);
		
		ctx.registerShutdownHook();
		
	}

}
