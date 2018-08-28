package com.singtel.animal.model;

public interface AnimalThatCanSwim {

	default boolean canSwim() {
		return true;
	}

}
