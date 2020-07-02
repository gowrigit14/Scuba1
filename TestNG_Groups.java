package com.scubatraining.Gowri.Calculator;

import org.testng.annotations.Test;

public class TestNG_Groups {

	@Test(groups = {"int", "sum"})
	public void sum() {
		System.out.println("Addition of inputs -> " + Calculator.add(6,3));	
		
	}
	@Test(groups = {"int", "sub"})
	public void sub() {
		System.out.println("Subtraction of inputs -> " + Calculator.sub(6,3));		
	}
	@Test(groups = {"int", "mul"})
	public void mul() {
		System.out.println("Multiplication of inputs -> " + Calculator.mul(6,3));		
	}
	@Test(groups = {"int", "divint"})
	public void divint() {
		System.out.println("Integer Division of inputs -> " + Calculator.divInt(6,3));		
	}
	@Test(groups = {"double", "divReal"})
	public void divReal() {
		System.out.println("Double Division of inputs -> " + Calculator.divReal(6,3));		
	}
	@Test(groups = {"double", "exp"})
	public void exp() {
		System.out.println("Exponential of inputs -> " + Calculator.exp(6,3));		
	}
	@Test(groups = {"double", "mod"})
	public void mod() {
		System.out.println("Modulus of inputs -> " + Calculator.mod(6,3));	
	}
	@Test(groups = {"double", "inv"})
	public void inv() {
		System.out.println("Inverse of inputs -> " + Calculator.inverse(6));		
	}
	@Test(groups = {"double", "negate"})
	public void negate() {
		System.out.println("Negate of inputs -> " + Calculator.negate(6));		
	}
}

