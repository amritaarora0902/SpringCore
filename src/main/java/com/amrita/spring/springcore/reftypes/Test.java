package com.amrita.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/reftypes/config.xml");
		Student student = (Student) con.getBean("student");
		System.out.println(student);
		
	}

}
