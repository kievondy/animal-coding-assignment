package com.singtel.animal.model;

public class Shark extends Fish {

	private static final long serialVersionUID = 1L;

	static final String SHARK_CHARACTERISTIC = "Eats other fish";

	public Shark() {
		super(FishSize.LARGE, FishColour.GREY, SHARK_CHARACTERISTIC);
	}

}
