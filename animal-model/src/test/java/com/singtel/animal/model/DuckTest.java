package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuckTest {
	
	Duck testSubject = new Duck();

	@Test
	public void testSing() {
		assertTrue(testSubject.sing().equals(Duck.MSG_DUCK_SINGING));
	}

	@Test
	public void testCanSwim() {
		assertTrue(testSubject.canSwim());
	}

}
