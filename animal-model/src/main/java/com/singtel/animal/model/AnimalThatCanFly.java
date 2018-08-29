package com.singtel.animal.model;

import java.io.Serializable;

public interface AnimalThatCanFly extends Serializable {

	String MSG_FLYING = "I am flying";

	default boolean canFly() {
		return true;
	}

	/*
	 * Standard JSON requires getter, therefore we provide isCanFly() so the value
	 * is visible in RESTful API.
	 */
	default boolean isCanFly() {
		return canFly();
	}

	default String fly() {
		return canFly() ? MSG_FLYING : null;
	};

	/*
	 * Standard JSON requires getter, therefore we provide getFly() so the value is
	 * visible in RESTful API.
	 */
	default String getFly() {
		return fly();
	};

}
