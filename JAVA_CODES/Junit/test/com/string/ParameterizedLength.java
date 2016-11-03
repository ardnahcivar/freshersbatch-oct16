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
public class ParameterizedLength {

	@Parameter(value = 0)
	 public static String  name;
	
	@Parameter(value = 1)
	public static int len;
	
	@Parameters
	public static Collection<Object []> data(){
		return Arrays.asList(new Object[][]{{"ravi",4},{"abc",3},{"xyz",3},{"abcxyz",6},{"def",3},{"ghi",3},{"defghi",6}});
	}
	
	@Test
	public void LengthTest(){
		StringOperations oper = new StringOperations();
		assertEquals(name.length(),oper.getLength(name));
	}
}
