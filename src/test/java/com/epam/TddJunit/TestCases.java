package com.epam.TddJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCases {

	@BeforeEach
	void welcomeText() {
		System.out.println("TESTCASE RAN!!");
	}
	
	@Test
	void testNChars() {
		Removechars obj = new Removechars();
		String result = obj.removeA("Aami KKR");
		assertEquals("mi KKR" , result);
	}
	
	@Test
	void test0Chars() {
		Removechars obj = new Removechars();
		String result = obj.removeA("");
		assertEquals("Input String not found!!" , result);
	}
	
	@Test
	void test1Chars() {
		Removechars obj = new Removechars();
		String result = obj.removeA("A");
		assertEquals("Removed!" , result);
	}
	
	@Test
	void test2Chars() {
		Removechars obj = new Removechars();
		String result = obj.removeA("AB");
		assertEquals("B" , result);
	}
	
	@Test
	void test3Chars() {
		Removechars obj = new Removechars();
		String result = obj.removeA("ABA");
		assertEquals("BA" , result);
	}

}