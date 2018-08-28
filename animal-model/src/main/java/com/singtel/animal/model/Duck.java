package com.singtel.animal.model;

public class Duck extends Bird implements AnimalThatCanSwim {

	static final String MSG_DUCK_SINGING = "Quack, quack";

	@Override
	public boolean canSwim() {
		return true;
	}

	@Override
	public String sing() {
		return MSG_DUCK_SINGING;
	}

}
