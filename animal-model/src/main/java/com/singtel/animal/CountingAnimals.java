package com.singtel.animal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.singtel.animal.model.Animal;
import com.singtel.animal.model.AnimalThatCanFly;
import com.singtel.animal.model.AnimalThatCanMakeSound;
import com.singtel.animal.model.AnimalThatCanSwim;
import com.singtel.animal.model.AnimalThatCanWalk;
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

public class CountingAnimals {

	public static void main(String[] args) {
		new CountingAnimals().process();
	}

	private void process() {

		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(new Rooster().sing()),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
				};
		
		System.out.println(String.format("The number of animals in the array is '%s'", animals.length));

		List<Animal> animalList = Arrays.asList(animals);

		int countAnimalThatCanFly = countAnimalThatCanFly(animalList);
		System.out.println(String.format("The number of animals that can fly is '%s'", countAnimalThatCanFly));

		int countAnimalThatCanWalk = countAnimalThatCanWalk(animalList);
		System.out.println(String.format("The number of animals that can walk is '%s'", countAnimalThatCanWalk));

		int countAnimalThatCanSing = countAnimalThatCanSing(animalList);
		System.out.println(String.format("The number of animals that can sing is '%s'", countAnimalThatCanSing));

		int countAnimalThatCanSwim = countAnimalThatCanSwim(animalList);
		System.out.println(String.format("The number of animals that can swim is '%s'", countAnimalThatCanSwim));
	}

	private int countAnimalThatCanSwim(List<Animal> animalList) {

		// AnimalThatCanSwim predicate
		Predicate<Animal> predicate = animal -> {
			if (animal instanceof AnimalThatCanSwim) {
				return ((AnimalThatCanSwim) animal).canSwim();
			}
			return false;
		};

		return countAnimals(animalList, predicate);

	}

	private int countAnimalThatCanSing(List<Animal> animalList) {

		// AnimalThatCanMakeSound predicate
		Predicate<Animal> predicate = animal -> {
			if (animal instanceof AnimalThatCanMakeSound) {
				return ((AnimalThatCanMakeSound) animal).canSing();
			}
			return false;
		};

		return countAnimals(animalList, predicate);

	}

	private int countAnimalThatCanWalk(List<Animal> animalList) {

		// AnimalThatCanWalk predicate
		Predicate<Animal> predicate = animal -> {
			if (animal instanceof AnimalThatCanWalk) {
				return ((AnimalThatCanWalk) animal).canWalk();
			}
			return false;
		};

		return countAnimals(animalList, predicate);

	}

	private int countAnimalThatCanFly(List<Animal> animalList) {

		// AnimalThatCanFly predicate
		Predicate<Animal> predicate = animal -> {
			if (animal instanceof AnimalThatCanFly) {
				// check canFly() execution, because some may return false (i.e. overriden, e.g.
				// butterfly when in different life-cycle state).
				return ((AnimalThatCanFly) animal).canFly();
			}
			return false;
		};

		return countAnimals(animalList, predicate);

	}

	private int countAnimals(List<Animal> animalList, Predicate<Animal> predicate) {

		return animalList.stream().filter(predicate).collect(Collectors.toList()).size();

	}

}
