package com.JavaBean.Email;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringValidationTester {
	private StringValidation validation = new StringValidation();
	
	@Test
	public void testCheckDate() {
		boolean isDate = validation.checkDate("2015-06-07");
		assertEquals(true, isDate);
		isDate = validation.checkDate("20150607");
		assertEquals(false, isDate);
	}
	
	@Test
	public void testCheckPhone() {
		boolean isPhoneNumber = validation.checkPhone("13814221598");
		assertEquals(true, isPhoneNumber);
		isPhoneNumber = validation.checkDate("20150607");
		assertEquals(false, isPhoneNumber);
	}
	
	@Test
	public void testCheckEmail() {
		boolean isEmail = validation.checkEmail("timtang@hotmail.com");
		assertEquals(true, isEmail);
		isEmail = validation.checkEmail("timtang09");
		assertEquals(false, isEmail);
	}
	
	@Test
	public void testHelloWorld() {
		System.out.println("Hello World!");
	}
}
