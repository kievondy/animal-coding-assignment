package com.singtel.animal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_SWIM_PREDICATE);
	}

	private int countAnimalThatCanSing(List<Animal> animalList) {
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_MAKE_SOUND_PREDICATE);
	}

	private int countAnimalThatCanWalk(List<Animal> animalList) {
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_WALK_PREDICATE);
	}

	private int countAnimalThatCanFly(List<Animal> animalList) {
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_FLY_PREDICATE);
	}

	private int countAnimals(List<Animal> animalList, Predicate<Animal> predicate) {
		return animalList.stream().filter(predicate).collect(Collectors.toList()).size();
	}

}
