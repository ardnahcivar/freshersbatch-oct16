package com.ravi.spring.aspect;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		Adder add = (Adder)context.getBean("adder");
		add.addArray();
		add.addVector();
		
		
		

	}

}
