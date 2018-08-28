package com.singtel.animal.model;

public class Bird implements Animal {

	static final String MSG_BIRD_WALKING = "I am walking";
	static final String MSG_BIRD_FLYING = "I am flying";
	static final String MSG_BIRD_SINGING = "Chirp chirp";

	public String walk() {
		return MSG_BIRD_WALKING;
	}

	public String fly() {
		return MSG_BIRD_FLYING;
	}

	public String sing() {
		return MSG_BIRD_SINGING;
	}

	// Standard behaviour for standard bird. E.g. An eagle
	public boolean canFly() {
		return true;
	}

}
