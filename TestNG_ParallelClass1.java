package com.scubatraining.Gowri.Calculator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParallelClass1 {

	@Test
	@Parameters({"number1","number2"})
	public void testMethod1(int input1,int input2) {
		System.out.println("Class 1 : Addition of inputs -> " + Calculator.add(input1, input2));
		System.out.println("Class 1 : Subtraction of inputs -> " + Calculator.sub(input1, input2));
		System.out.println("Class 1 : Multiplication of inputs -> " + Calculator.mul(input1, input2));
		System.out.println("Class 1 : Int Division of inputs -> " + Calculator.divInt(input1, input2));
		System.out.println("Class 1 : Double Division of inputs -> " + Calculator.divReal(input1, input2));
		System.out.println("Class 1 : Exponent of inputs -> " + Calculator.exp(input1, input2));
		System.out.println("Class 1 : Modulus of inputs -> " + Calculator.mod(input1, input2));
		System.out.println("Class 1 : Inverse of inputs -> " + Calculator.negate(input1));
		}
}
