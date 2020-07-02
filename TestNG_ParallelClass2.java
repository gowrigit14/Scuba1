package com.scubatraining.Gowri.Calculator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParallelClass2 {

	@Test
	@Parameters({"number3","number4"})
	public void testMethod1(int input1,int input2) {
		System.out.println(" Class 2 : Addition of inputs -> " + Calculator.add(input1, input2));
		System.out.println("Class 2 : Subtraction of inputs -> " + Calculator.sub(input1, input2));
		System.out.println("Class 2 : Multiplication of inputs -> " + Calculator.mul(input1, input2));
		System.out.println("Class 2 : Int Division of inputs -> " + Calculator.divInt(input1, input2));
		System.out.println("Class 2 : Double Division of inputs -> " + Calculator.divReal(input1, input2));
		System.out.println("Class 2 : Exponent of inputs -> " + Calculator.exp(input1, input2));
		System.out.println("Class 2 : Modulus of inputs -> " + Calculator.mod(input1, input2));
		System.out.println("Class 2 : Inverse of inputs -> " + Calculator.negate(input1));
		}
}
