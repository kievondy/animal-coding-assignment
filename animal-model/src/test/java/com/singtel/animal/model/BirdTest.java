package com.singtel.animal.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BirdTest {

	Bird testSubject = new Bird();

	@Test
	public void testFly() {
		assertTrue(testSubject.fly().equals(AnimalThatCanFly.MSG_FLYING));
	}

	@Test
	public void testSing() {
		assertTrue(testSubject.sing().equals(Bird.MSG_BIRD_SINGING));
	}

	@Test
	public void testWalk() {
		assertTrue(testSubject.walk().equals(AnimalThatCanWalk.MSG_WALKING));
	}

	@Test
	public void testCanFly() {
		assertTrue(testSubject.canFly());
	}

}
