package com.singtel.animal.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ButterflyTest {

	Butterfly testSubject = new Butterfly();

	@Test
	public void test() {
		assertTrue(testSubject.canFly());
		assertTrue(testSubject.fly().equals(AnimalThatCanFly.MSG_FLYING));
	}

	@Test
	public void test_Metamorphosis() {

		// testSubject is in ADULT state
		// butterfly2 is in EGG state
		Butterfly butterfly2 = testSubject.nextLifeCycle();
		assertTrue(!butterfly2.canFly());
		assertTrue(butterfly2.fly() == null);
		assertTrue(!butterfly2.canWalk());
		assertTrue(butterfly2.walk() == null);
		assertTrue(butterfly2.getState() == ButterflyLifeCycleState.EGG);

		// butterfly3 is in CATERPILLAR state
		Butterfly butterfly3 = butterfly2.nextLifeCycle();
		assertTrue(!butterfly3.canFly());
		assertTrue(butterfly3.fly() == null);
		assertTrue(butterfly3.canWalk());
		assertTrue(butterfly3.walk().equals(AnimalThatCanWalk.MSG_WALKING));
		assertTrue(butterfly3.getState() == ButterflyLifeCycleState.CATERPILLAR);

		// butterfly4 is in PUPA state
		Butterfly butterfly4 = butterfly3.nextLifeCycle();
		assertTrue(!butterfly4.canFly());
		assertTrue(butterfly4.fly() == null);
		assertTrue(!butterfly4.canWalk());
		assertTrue(butterfly4.walk() == null);
		assertTrue(butterfly4.getState() == ButterflyLifeCycleState.PUPA);

		// butterfly5 is in ADULT state
		Butterfly butterfly5 = butterfly4.nextLifeCycle();
		assertTrue(butterfly5.canFly());
		assertTrue(butterfly5.fly().equals(AnimalThatCanFly.MSG_FLYING));
		assertTrue(!butterfly5.canWalk());
		assertTrue(butterfly5.walk() == null);
		assertTrue(butterfly5.getState() == ButterflyLifeCycleState.ADULT);
	}

}
