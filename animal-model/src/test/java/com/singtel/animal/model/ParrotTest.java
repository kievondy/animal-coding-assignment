package com.singtel.animal.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParrotTest {

	@Test
	public void testSing() {
		String voiceToMimic = "arbitraryVoiceToMimic";
		Parrot testSubject = new Parrot(voiceToMimic);
		assertTrue(testSubject.sing().equals(voiceToMimic));
	}

}
