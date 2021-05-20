package com.amrita.spring.springcore.injectinginterfaces;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/amrita/spring/springcore/injectinginterfaces/config.xml");
		OrderBO bo =(OrderBO)con.getBean("bo");
		bo.placeOrder();
		
		
		
	}

}
