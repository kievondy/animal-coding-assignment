package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoosterTest {
	
	Rooster testSubject = new Rooster();

	@Test
	public void testSing() {
		assertTrue(testSubject.sing().equals(Rooster.MSG_ROOSTER_SINGING));
	}

}
