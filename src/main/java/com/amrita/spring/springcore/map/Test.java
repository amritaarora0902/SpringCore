package com.amrita.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/map/mapconfig.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
		
	}

}
