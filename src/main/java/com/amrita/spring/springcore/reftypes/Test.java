package com.amrita.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/reftypes/config.xml");
		Student stud = (Student) context.getBean("student");
		System.out.println(stud);
		
	}

}
