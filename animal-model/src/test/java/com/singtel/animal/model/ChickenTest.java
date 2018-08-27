package com.singtel.animal.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChickenTest {

	Chicken testSubject = new Chicken();

	@Test
	public void testSing() {
		assertTrue(testSubject.sing().equals(Chicken.MSG_CHICKEN_SINGING));
	}

	@Test
	public void testCanFly() {
		assertTrue(!testSubject.canFly());
	}

}
