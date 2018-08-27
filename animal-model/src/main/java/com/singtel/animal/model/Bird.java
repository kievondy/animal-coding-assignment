package com.singtel.animal.model;

public class Bird extends Animal {

	static final String MSG_BIRD_FLYING = "I am flying";
	static final String MSG_BIRD_SINGING = "Chirp chirp";

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

	// Standard behaviour for standard bird. E.g. An eagle
	public boolean canSwim() {
		return false;
	}

}
