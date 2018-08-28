package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClownfishTest {

	Clownfish testSubject = new Clownfish();

	@Test
	public void test() {
		assertTrue(testSubject.getColour() == FishColour.ORANGE);
		assertTrue(testSubject.getSize() == FishSize.SMALL);
		assertTrue(testSubject.getCharacteristic().equals(Clownfish.CLOWNFISH_CHARACTERISTIC));
	}

}
