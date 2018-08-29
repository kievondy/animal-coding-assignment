package com.singtel.animal.model;

public class Bird implements Vertebrate, AnimalThatCanFly, AnimalThatCanMakeSound, AnimalThatCanWalk {

	private static final long serialVersionUID = 1L;

	static final String MSG_BIRD_SINGING = "Chirp chirp";

	@Override
	public String sing() {
		return MSG_BIRD_SINGING;
	}

}
