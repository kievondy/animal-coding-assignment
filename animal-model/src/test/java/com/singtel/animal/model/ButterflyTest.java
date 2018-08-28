package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ButterflyTest {
	
	Butterfly testSubject = new Butterfly();

	@Test
	public void test() {
		assertTrue(testSubject.canFly());
		assertTrue(testSubject.fly().equals(AnimalThatCanFly.MSG_FLYING));
	}

}
