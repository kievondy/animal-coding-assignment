package com.singtel.animal.model;

public class Shark extends Fish {

	static final String SHARK_CHARACTERISTIC = "Eats other fish";

	public Shark() {
		super(FishSize.LARGE, FishColour.GREY, SHARK_CHARACTERISTIC);
	}

}
