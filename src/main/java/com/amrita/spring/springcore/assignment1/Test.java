package com.amrita.spring.springcore.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/assignment1/config.xml");
		ShoppingCart shop = (ShoppingCart) con.getBean("shoppingcart");
		System.out.println(shop);
		
	}

}
