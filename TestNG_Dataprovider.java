package com.scubatraining.Gowri.Calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Dataprovider {
	
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{5, 3},
		//	{9, 2},
		//	{5, 5}
		};
	}
	
	@Test(dataProvider="inputs")
	public void testMethod1(int input1, int input2) {
		Calculator obj = new Calculator();
		System.out.println("Addition of inputs -> " + obj.add(input1, input2));
		System.out.println("Subtraction of inputs -> " + obj.sub(input1, input2));
		System.out.println("Multiplication of inputs -> " + obj.mul(input1, input2));
		System.out.println("Int Division of inputs -> " + obj.divInt(input1, input2));
		System.out.println("Double Division of inputs -> " + obj.divReal(input1, input2));
		System.out.println("Exponent of inputs -> " + obj.exp(input1, input2));
		System.out.println("Modulus of inputs -> " + obj.mod(input1, input2));
		System.out.println("Inverse of inputs -> " + obj.negate(input1));
		
	}		
}