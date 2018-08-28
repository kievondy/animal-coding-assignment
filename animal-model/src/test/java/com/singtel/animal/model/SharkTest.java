package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class SharkTest {
	
	Shark testSubject = new Shark();

	@Test
	public void test() {
		assertTrue(testSubject.getColour() == FishColour.GREY);
		assertTrue(testSubject.getSize() == FishSize.LARGE);
		assertTrue(testSubject.getCharacteristic().equals(Shark.SHARK_CHARACTERISTIC));
	}

}
