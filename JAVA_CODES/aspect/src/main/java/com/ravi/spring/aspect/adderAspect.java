package com.ravi.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class adderAspect {

	private long start;
	
	@Pointcut("execution(* Adder.*(..))")
	public void adder_point(){}
	
	@Before("adder_point()")
	public void startTime(){
		start = System.currentTimeMillis();
		System.out.println(start);
	}
	
	@After("adder_point()")
	public void endTime(){
		 System.out.println(System.currentTimeMillis()-start);
	}
	
	
}
