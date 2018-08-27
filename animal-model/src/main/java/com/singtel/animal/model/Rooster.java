package com.singtel.animal.model;

public class Rooster extends Chicken {

	static final String MSG_ROOSTER_SINGING = "Cock-a-doodle-doo";

	@Override
	public String sing() {
		return MSG_ROOSTER_SINGING;
	}

}
