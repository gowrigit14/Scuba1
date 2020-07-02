package com.scubatraining.Gowri.Calculator;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG_ReportandLogs {
	
	@BeforeClass
	public void start() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs once before class", true);
	}
	
	@AfterClass
	public void end() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs once after class", true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs before every method", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs after every method", true);
	}
	
	
	@Test
	public void testMethod1() {
		Reporter.log("Addition of inputs ->" + Calculator.add(7, 8), true);
		Reporter.log("Subtraction of inputs -> " + Calculator.sub(7,8),true);
		Reporter.log("Multiplication of inputs -> " + Calculator.mul(7,8),true);
		Reporter.log("Int Division of inputs -> " + Calculator.divInt(7,8),true);
		Reporter.log("Real Divisoin of inputs -> " + Calculator.divReal(7,8),true);
		Reporter.log("Exponent of inputs -> " + Calculator.exp(7,8),true);
		Reporter.log("Modulus of inputs -> " + Calculator.mod(7,8),true);
		Reporter.log("Inverse of inputs -> " + Calculator.inverse(7),true);
	    Reporter.log("Negate of inputs -> " + Calculator.negate(7),true);
	    //Assert.assertTrue(true);
	    Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods={ "testMethod1" })
	public void testMethod2() {
		Reporter.log("This method depends upon Method1", true);
	}
}
