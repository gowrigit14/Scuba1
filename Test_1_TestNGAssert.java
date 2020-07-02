package com.scubatraining.Gowri.Calculator;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Test_1_TestNGAssert extends Calculator {
	
	@Test
	public void testSum() {
		System.out.println("\nRunning Test -> testSum");
		int result = add(1, 2);
		System.out.println(result);
		Assert.assertEquals(result, 3);
		Assert.assertNotEquals(result, 8);
		Assert.assertTrue(result==3);
		Assert.assertFalse(result!=3);
		
	}
	
	@Test
	public void testdiff() {
		System.out.println("\nRunning Test -> testdiff");
		int result = sub(9, 3);
		System.out.println(result);
		Assert.assertEquals(result, 6);
		Assert.assertNotEquals(result, 7);
		Assert.assertTrue(result==6);
		Assert.assertFalse(result!=6);
	}
	
	@Test
	public void testmul() {
		System.out.println("\nRunning Test -> testmultiply");
		int result = mul(5,3);
		System.out.println(result);
		Assert.assertEquals(result, 15);
		Assert.assertNotEquals(result, 20);
		Assert.assertTrue(result==15);
		Assert.assertFalse(result!=15);
	}
	
	@Test
	public void testdivInt() {
		System.out.println("\nRunning Test -> testdivision using Real numbers");
		int result = divInt(6,2);
		System.out.println(result);
		Assert.assertEquals(result, 3);
		Assert.assertNotEquals(result, 5);
		Assert.assertTrue(result==3);
		Assert.assertFalse(result!=3);
	}
	
	@Test
	public void testdivDouble() {
		System.out.println("\nRunning Test -> testdivision using Double numbers");
		double result = divReal(7,2);
		System.out.println(result);
		Assert.assertEquals(result, 3.5);
		Assert.assertNotEquals(result, 5);
		Assert.assertTrue(result==3.5);
		Assert.assertFalse(result!=3.5);
	}
	
	@Test
	public void testexp() {
		System.out.println("\nRunning Test -> test exponent");
		double result = exp(6,2);
		System.out.println(result);
		Assert.assertEquals(result, 36.0);
		Assert.assertNotEquals(result, 40);
		Assert.assertTrue(result==36.0);
		Assert.assertFalse(result!=36.0);
	}
	
	@Test
	public void testmod() {
		System.out.println("\nRunning Test -> test modulus");
		int result = mod(11,2);
		System.out.println(result);
		Assert.assertEquals(result, 1);
		Assert.assertNotEquals(result, 2);
		Assert.assertTrue(result==1);
		Assert.assertFalse(result!=1);
	}
	
	@Test
	public void testinverse() {
		System.out.println("\nRunning Test -> test inverse");
		Double result =  inverse(5);
		System.out.println(result);
		Assert.assertEquals(result.doubleValue(), 0.2);
		Assert.assertNotEquals(result, 4);
		Assert.assertTrue(result==0.2);
		Assert.assertFalse(result!=0.2);		
	}
	
	@Test
	public void testnegate() {
		System.out.println("\nRunning Test -> test negate");
		int result = negate(1);
		System.out.println(result);
		Assert.assertEquals(result, -1);
		Assert.assertNotEquals(result, 5);
		Assert.assertTrue(result==-1);
		Assert.assertFalse(result!=-1);	
	}
} 