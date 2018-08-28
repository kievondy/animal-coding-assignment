package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class FishTest {
	
	Fish testSubject = new Fish();

	@Test
	public void testCanSwim() {
		assertTrue(testSubject.canSwim());
		assertTrue(testSubject.getColour() == null);
		assertTrue(testSubject.getSize() == null);
		assertTrue(testSubject.getCharacteristic() == null);
	}

}
