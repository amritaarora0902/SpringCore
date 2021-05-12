package com.amrita.spring.springcore.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/assignment1/config.xml");
		ShoppingCart sh = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(sh);
		
	}

}
