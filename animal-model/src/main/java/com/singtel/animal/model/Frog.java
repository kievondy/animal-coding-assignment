package com.singtel.animal.model;

public class Frog extends Amphibian implements AnimalThatCanSwim, AnimalThatCanMakeSound {

	static final String MSG_FROG_SINGING = "Croak, croak";

	@Override
	public String sing() {
		return MSG_FROG_SINGING;
	}

}
