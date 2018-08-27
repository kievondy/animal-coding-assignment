package com.singtel.animal.model;

public class Chicken extends Bird {

	static final String MSG_CHICKEN_SINGING = "Cluck, cluck";

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public String sing() {
		return MSG_CHICKEN_SINGING;
	}

}
