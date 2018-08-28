package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogTest {
	
	Frog testSubject = new Frog();

	@Test
	public void test() {
		assertTrue(testSubject.canSing());
		assertTrue(testSubject.sing().equals(Frog.MSG_FROG_SINGING));
		assertTrue(testSubject.canSwim());
	}

}
