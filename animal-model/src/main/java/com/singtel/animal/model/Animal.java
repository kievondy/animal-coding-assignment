package com.singtel.animal.model;

import java.io.Serializable;

public interface Animal extends Serializable {

	/*
	 * Standard JSON requires getter (and setter). Some of the classed (E.g. Bird)
	 * has no property at all. Therefore, we provide a common (default) getter to
	 * print the animal type.
	 */
	default String getAnimalType() {
		return this.getClass().getName();
	}

}
