package com.singtel.animal.model;

public class Frog extends Amphibian implements AnimalThatCanSwim, AnimalThatCanMakeSound {

	private static final long serialVersionUID = 1L;

	static final String MSG_FROG_SINGING = "Croak, croak";

	@Override
	public String sing() {
		return MSG_FROG_SINGING;
	}

}
