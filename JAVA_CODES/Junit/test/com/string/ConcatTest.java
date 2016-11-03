package com.string;


import static org.junit.Assert.*;

import org.junit.*;




public class ConcatTest {
		@BeforeClass
		public static  void beforeClass(){
			System.out.println("Called before Class");
		}
	
		@Before
		public void before(){
			System.out.println("Before testing");
		}
		
		
		@After
		public void after(){
			System.out.println("After testing");
		}
		
		@AfterClass
		public static void AfterClass(){
			System.out.println("Called After Class");
		}
		@Test
		public void concatCheck(){
			StringOperations oper = new StringOperations();
			assertEquals("RaviBhanage",oper.Concat("Ravi", "Bhanage"));
			
		}
}
