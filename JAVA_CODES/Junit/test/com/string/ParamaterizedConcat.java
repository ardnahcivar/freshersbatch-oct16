package com.string;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamaterizedConcat {
	
	@Parameter(value = 0)
	public String first;
	
	@Parameter(value = 1)
	public String second;
	
	@Parameter(value = 2)
	public String third;
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{{"ravi","bhanage","ravibhanage"},{"abc","xyz","abcxyz"},{"def","ghi","defghi"}});
	}
	
	
	@Test
	public void parameterizedTest(){
		StringOperations oper = new StringOperations();
		assertEquals(third,oper.Concat(first, second));
		
	}
	

}
