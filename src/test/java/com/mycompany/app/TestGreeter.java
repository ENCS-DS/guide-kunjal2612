package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGreeter {
	
	@Test
	public void testSayHello() {
		Greeter myGreeter = new Greeter();
		assertEquals("hello", myGreeter.SayHello());
	}
}