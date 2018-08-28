package com.singtel.animal.model;

public interface AnimalThatCanFly {

	String MSG_FLYING = "I am flying";

	default boolean canFly() {
		return true;
	}

	default String fly() {
		return MSG_FLYING;
	};

}
