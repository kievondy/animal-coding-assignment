package com.singtel.animal.model;

public interface AnimalThatCanMakeSound {

	default boolean canSing() {
		return true;
	}

	String sing();

}
