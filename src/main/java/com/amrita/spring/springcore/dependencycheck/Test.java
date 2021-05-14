package com.amrita.spring.springcore.dependencycheck;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/dependencycheck/config.xml");
		Prescription precription = (Prescription) con.getBean("prescription");
		System.out.println(precription);
		
		
	}

}
