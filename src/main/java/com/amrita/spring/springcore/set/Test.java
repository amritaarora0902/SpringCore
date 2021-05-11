package com.amrita.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/set/setconfig.xml");
		CarDealer car = (CarDealer) context.getBean("cardealer");
		System.out.println(car.getName());
		System.out.println(car.getModels());
	}

}
