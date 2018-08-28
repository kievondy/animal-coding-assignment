package com.singtel.animal.model;

public class Fish implements Vertebrate, AnimalThatCanSwim {

	FishSize size = null;
	FishColour colour = null;
	String characteristic = null;

	public Fish() {
	}

	public Fish(FishSize size, FishColour colour, String characteristic) {
		super();
		this.size = size;
		this.colour = colour;
		this.characteristic = characteristic;
	}

	public FishSize getSize() {
		return size;
	}

	public void setSize(FishSize size) {
		this.size = size;
	}

	public FishColour getColour() {
		return colour;
	}

	public void setColour(FishColour colour) {
		this.colour = colour;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

}
