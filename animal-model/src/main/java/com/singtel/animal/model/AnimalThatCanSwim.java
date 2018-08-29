package com.singtel.animal.model;

import java.io.Serializable;

public interface AnimalThatCanSwim extends Serializable {

	default boolean canSwim() {
		return true;
	}

	/*
	 * Standard JSON requires getter, therefore we provide isCanSwim() so the value
	 * is visible in RESTful API.
	 */
	default boolean isCanSwim() {
		return canSwim();
	};

}
