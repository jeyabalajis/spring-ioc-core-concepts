package com.jeya.spring.springcore.shopping;

import java.util.Arrays;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ShoppingCart implements InitializingBean, DisposableBean{
	private Item[] items;

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		System.out.println("inside setting items");
		this.items = items;
	} 

	@Override
	public String toString() {
		return "ShoppingCart [items=" + Arrays.toString(items) + "]";
	}
	
	public void hi() {
		System.out.println("hi there!");
	}
	
	public void bye() {
		System.out.println("bye bye!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hi there ShoppingCart!");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bye Bye ShoppingCart!");
	}
	
}
