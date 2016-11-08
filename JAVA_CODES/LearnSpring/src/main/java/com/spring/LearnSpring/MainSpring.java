package com.spring.LearnSpring;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	//	Order orderBean = (Order)context.getBean("order_1");
		//System.out.println(orderBean.toString());
	//	AllOrders allOrders = new AllOrders();
		
		Order o1 = (Order)context.getBean("order_1");
		Order o2 = (Order)context.getBean("order_2");
		Order o3 = (Order)context.getBean("order_3");
		
		AllOrders all = (AllOrders)context.getBean("AllOrders");
		System.out.println(all.toString());
	}

}
