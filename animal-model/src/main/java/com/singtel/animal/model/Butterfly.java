package com.singtel.animal.model;

public class Butterfly extends Insect implements AnimalThatCanFly, AnimalThatCanWalk {

	private static final long serialVersionUID = 1L;

	// Default state is Adult
	ButterflyLifeCycleState state = ButterflyLifeCycleState.ADULT;

	public Butterfly() {
	}

	public Butterfly(ButterflyLifeCycleState state) {
		this();
		this.state = state;
	}

	public ButterflyLifeCycleState getState() {
		return state;
	}

	public void setState(ButterflyLifeCycleState state) {
		this.state = state;
	}

	public Butterfly nextLifeCycle() {
		if (state == ButterflyLifeCycleState.ADULT) {
			// produces egg
			return new Butterfly(ButterflyLifeCycleState.EGG);
		}

		if (state == ButterflyLifeCycleState.EGG) {
			state = ButterflyLifeCycleState.CATERPILLAR;

		} else if (state == ButterflyLifeCycleState.CATERPILLAR) {
			state = ButterflyLifeCycleState.PUPA;

		} else if (state == ButterflyLifeCycleState.PUPA) {
			state = ButterflyLifeCycleState.ADULT;
		}
		return this;
	}

	@Override
	public boolean canWalk() {
		return state == ButterflyLifeCycleState.CATERPILLAR;
	}

	@Override
	public boolean canFly() {
		return state == ButterflyLifeCycleState.ADULT;
	}

}
