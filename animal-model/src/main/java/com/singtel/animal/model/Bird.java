package com.singtel.animal.model;

public class Bird implements Vertebrate, AnimalThatCanFly, AnimalThatCanMakeSound, AnimalThatCanWalk {

	static final String MSG_BIRD_SINGING = "Chirp chirp";

	@Override
	public String sing() {
		return MSG_BIRD_SINGING;
	}

}
