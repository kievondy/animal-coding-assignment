package com.singtel.animal.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DolphinTest {

	Dolphin testSubject = new Dolphin();

	@Test
	public void test() {
		assertTrue(testSubject.canSwim());
	}

}
