package com.string;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LengthTest {

	@BeforeClass
	public static  void beforeClass(){
		System.out.println("Called Length test before Class");
	}

	@Before
	public void before(){
		System.out.println("Before   Length test testing");
	}
	
	
	@After
	public void after(){
		System.out.println("After  Length test testing");
	}
	
	@AfterClass
	public static void AfterClass(){
		System.out.println("Called  Length test After Class");
	}
	@Test
	public void lengthCheck(){
		StringOperations oper = new StringOperations();
		assertEquals(12,oper.getLength("ravichandra"));
		
	}
}
