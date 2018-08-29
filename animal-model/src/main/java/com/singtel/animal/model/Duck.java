package com.singtel.animal.model;

public class Duck extends Bird implements AnimalThatCanSwim {

	private static final long serialVersionUID = 1L;

	static final String MSG_DUCK_SINGING = "Quack, quack";

	@Override
	public String sing() {
		return MSG_DUCK_SINGING;
	}

}
