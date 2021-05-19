package com.amrita.spring.springcore.stereotypeanotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/stereotypeanotations/config.xml");
		Instructor instructor = (Instructor) context.getBean("instructor");
		System.out.println(instructor);
	}

}
