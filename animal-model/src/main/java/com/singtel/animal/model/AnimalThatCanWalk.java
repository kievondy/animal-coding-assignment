package com.singtel.animal.model;

import java.io.Serializable;

public interface AnimalThatCanWalk extends Serializable {

	String MSG_WALKING = "I am walking";

	default boolean canWalk() {
		return true;
	}

	/*
	 * Standard JSON requires getter, therefore we provide isCanWalk() so the value
	 * is visible in RESTful API.
	 */
	default boolean isCanWalk() {
		return canWalk();
	};

	default String walk() {
		return canWalk() ? MSG_WALKING : null;
	};

	/*
	 * Standard JSON requires getter, therefore we provide getWalk() so the value is
	 * visible in RESTful API.
	 */
	default String getWalk() {
		return walk();
	};

}
