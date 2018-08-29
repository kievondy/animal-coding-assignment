package com.singtel.animal.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RoosterTest {

	Rooster testSubject = new Rooster();

	@Test
	public void testSing() {
		String defaultVoice = Rooster.ROOSTER_VOICES.get(Rooster.DEFAULT_LOCALE);
		assertTrue(testSubject.sing().equals(defaultVoice));
	}

	@Test
	public void test() {

		Rooster.ROOSTER_VOICES.forEach((k, v) -> {

			Rooster rooster = new Rooster(k);
			String sing = rooster.sing();

			assertTrue(v.equals(sing));

		});

	}

}
