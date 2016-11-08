package com.spring.LearnSpring;

import java.util.List;

public class AllOrders {
	private List<Order> allOrders;

	
	public AllOrders(List<Order> all) {
		this.allOrders = all;
		int sum = 0;
		for(Order o :allOrders){
			sum += o.getItem().getPrice();
		}
		System.out.println(sum);		
	}



}
