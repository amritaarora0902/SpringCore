package com.amrita.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/innerbeans/config.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp.hashCode());
		
		Employee emp1 = (Employee) context.getBean("employee");
		System.out.println(emp1.hashCode());
	}
	

}
