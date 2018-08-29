package com.singtel.animal.model;

public class Dog extends Mammal implements AnimalThatCanMakeSound, AnimalThatCanWalk {

	private static final long serialVersionUID = 1L;

	static final String MSG_DOG_SINGING = "Woof, woof";

	@Override
	public String sing() {
		return MSG_DOG_SINGING;
	}

}
