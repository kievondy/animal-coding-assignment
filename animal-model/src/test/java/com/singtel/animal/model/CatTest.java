package com.singtel.animal.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {

	Cat testSubject = new Cat();

	@Test
	public void test() {
		assertTrue(testSubject.canSing());
		assertTrue(testSubject.sing().equals(Cat.MSG_CAT_SINGING));
		assertTrue(testSubject.canWalk());
		assertTrue(testSubject.walk().equals(AnimalThatCanWalk.MSG_WALKING));
	}

}
