package com.singtel.animal;

import java.util.Arrays;
import java.util.List;

import com.singtel.animal.model.Animal;
import com.singtel.animal.model.Bird;
import com.singtel.animal.model.Butterfly;
import com.singtel.animal.model.Cat;
import com.singtel.animal.model.Chicken;
import com.singtel.animal.model.Clownfish;
import com.singtel.animal.model.Dog;
import com.singtel.animal.model.Dolphin;
import com.singtel.animal.model.Duck;
import com.singtel.animal.model.Fish;
import com.singtel.animal.model.Frog;
import com.singtel.animal.model.Parrot;
import com.singtel.animal.model.Rooster;
import com.singtel.animal.model.Shark;
import com.singtel.animal.util.Utils;

public class CountingAnimals {

	public static void main(String[] args) {
		new CountingAnimals().process();
	}

	private void process() {

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(new Rooster().sing()), new Fish(), new Shark(),
				new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(), new Cat() };

		System.out.println(String.format("The number of animals in the array is '%s'", animals.length));

		List<Animal> animalList = Arrays.asList(animals);

		int countAnimalThatCanFly = Utils.countAnimalThatCanFly(animalList);
		System.out.println(String.format("The number of animals that can fly is '%s'", countAnimalThatCanFly));

		int countAnimalThatCanWalk = Utils.countAnimalThatCanWalk(animalList);
		System.out.println(String.format("The number of animals that can walk is '%s'", countAnimalThatCanWalk));

		int countAnimalThatCanSing = Utils.countAnimalThatCanSing(animalList);
		System.out.println(String.format("The number of animals that can sing is '%s'", countAnimalThatCanSing));

		int countAnimalThatCanSwim = Utils.countAnimalThatCanSwim(animalList);
		System.out.println(String.format("The number of animals that can swim is '%s'", countAnimalThatCanSwim));
	}

}
