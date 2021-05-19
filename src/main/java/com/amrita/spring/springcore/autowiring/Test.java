package com.amrita.spring.springcore.autowiring;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/autowiring/config.xml");
		Employee e = (Employee) con.getBean("employee");
		System.out.println(e);
		
		
	}

}
