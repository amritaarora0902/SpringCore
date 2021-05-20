package com.amrita.spring.springcore.injectinginterfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside Order DAO");

	}

}
