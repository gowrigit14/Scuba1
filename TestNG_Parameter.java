package com.scubatraining.Gowri.Calculator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter {

	@Test
	@Parameters({"number1","number2"})
	public void testMethod1(int input1,int input2) {
		System.out.println(" Addition of inputs -> " + Calculator.add(input1, input2));
		System.out.println("Subtraction of inputs -> " + Calculator.sub(input1, input2));
		System.out.println("Multiplication of inputs -> " + Calculator.mul(input1, input2));
		System.out.println("Int Division of inputs -> " + Calculator.divInt(input1, input2));
		System.out.println("Double Division of inputs -> " + Calculator.divReal(input1, input2));
		System.out.println("Exponent of inputs -> " + Calculator.exp(input1, input2));
		System.out.println("Modulus of inputs -> " + Calculator.mod(input1, input2));
		System.out.println("Inverse of inputs -> " + Calculator.negate(input1));
		}
}
