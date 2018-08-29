package com.singtel.animal.util;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.singtel.animal.model.Animal;
import com.singtel.animal.model.Bird;
import com.singtel.animal.model.Butterfly;
import com.singtel.animal.model.Cat;
import com.singtel.animal.model.Dolphin;
import com.singtel.animal.model.Fish;

public class UtilsTest {

	@Test
	public void testCountAnimalThatCanSwim() {

		List<Animal> animalList = Arrays.asList(new Animal[] { new Bird() });
		int count = Utils.countAnimalThatCanSwim(animalList);

		assertTrue(count == 0);

		animalList = Arrays.asList(new Animal[] { new Bird(), new Fish() });
		count = Utils.countAnimalThatCanSwim(animalList);

		assertTrue(count == 1);

	}

	@Test
	public void testCountAnimalThatCanSing() {

		List<Animal> animalList = Arrays.asList(new Animal[] { new Butterfly() });
		int count = Utils.countAnimalThatCanSing(animalList);

		assertTrue(count == 0);

		animalList = Arrays.asList(new Animal[] { new Cat(), new Butterfly() });
		count = Utils.countAnimalThatCanSing(animalList);

		assertTrue(count == 1);

	}

	@Test
	public void testCountAnimalThatCanWalk() {

		List<Animal> animalList = Arrays.asList(new Animal[] { new Fish() });
		int count = Utils.countAnimalThatCanWalk(animalList);

		assertTrue(count == 0);

		animalList = Arrays.asList(new Animal[] { new Cat(), new Dolphin() });
		count = Utils.countAnimalThatCanWalk(animalList);

		assertTrue(count == 1);

	}

	@Test
	public void testCountAnimalThatCanFly() {

		List<Animal> animalList = Arrays.asList(new Animal[] { new Cat() });
		int count = Utils.countAnimalThatCanFly(animalList);

		assertTrue(count == 0);

		animalList = Arrays.asList(new Animal[] { new Cat(), new Butterfly() });
		count = Utils.countAnimalThatCanFly(animalList);

		assertTrue(count == 1);

	}

}
