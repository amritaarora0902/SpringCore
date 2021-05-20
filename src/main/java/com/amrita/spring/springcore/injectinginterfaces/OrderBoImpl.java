package com.amrita.spring.springcore.injectinginterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBO {
	
	@Autowired
	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO");
		dao.createOrder();

	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
