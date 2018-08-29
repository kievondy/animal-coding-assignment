package com.singtel.animal.model;

public class Clownfish extends Fish {

	private static final long serialVersionUID = 1L;

	static final String CLOWNFISH_CHARACTERISTIC = "Makes jokes";

	public Clownfish() {
		super(FishSize.SMALL, FishColour.ORANGE, CLOWNFISH_CHARACTERISTIC);
	}

}
