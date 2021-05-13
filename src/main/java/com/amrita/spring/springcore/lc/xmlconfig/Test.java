package com.amrita.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/lc/xmlconfig/config.xml");
		Patient patient = (Patient) con.getBean("patient");
		System.out.println(patient);
		
	}

}
