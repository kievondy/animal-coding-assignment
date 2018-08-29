package com.singtel.animal.model;

public class Cat extends Mammal implements AnimalThatCanMakeSound, AnimalThatCanWalk {

	private static final long serialVersionUID = 1L;
	
	static final String MSG_CAT_SINGING = "Meow";

	@Override
	public String sing() {
		return MSG_CAT_SINGING;
	}

}
