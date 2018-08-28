package com.singtel.animal.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DogTest {

	Dog testSubject = new Dog();

	@Test
	public void test() {
		assertTrue(testSubject.canSing());
		assertTrue(testSubject.sing().equals(Dog.MSG_DOG_SINGING));
		assertTrue(testSubject.canWalk());
		assertTrue(testSubject.walk().equals(AnimalThatCanWalk.MSG_WALKING));
	}

}
