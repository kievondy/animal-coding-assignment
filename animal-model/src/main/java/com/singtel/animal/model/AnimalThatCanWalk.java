package com.singtel.animal.model;

public interface AnimalThatCanWalk {

	String MSG_WALKING = "I am walking";

	default boolean canWalk() {
		return true;
	}

	default String walk() {
		return canWalk() ? MSG_WALKING : null;
	};

}
