package com.singtel.animal.model;

import java.io.Serializable;

public interface AnimalThatCanMakeSound extends Serializable {

	default boolean canSing() {
		return true;
	}

	/*
	 * Standard JSON requires getter, therefore we provide isCanSing() so the value
	 * is visible in RESTful API.
	 */
	default boolean isCanSing() {
		return canSing();
	};

	String sing();

	/*
	 * Standard JSON requires getter, therefore we provide getSing() so the value is
	 * visible in RESTful API.
	 */
	default String getSing() {
		return sing();
	};

}
