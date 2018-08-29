package com.singtel.animal.util;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.singtel.animal.model.Animal;
import com.singtel.animal.model.AnimalThatCanFly;
import com.singtel.animal.model.AnimalThatCanMakeSound;
import com.singtel.animal.model.AnimalThatCanSwim;
import com.singtel.animal.model.AnimalThatCanWalk;

public class Utils {

	// AnimalThatCanSwim predicate
	public static Predicate<Animal> ANIMAL_THAT_CAN_SWIM_PREDICATE = animal -> {
		if (animal instanceof AnimalThatCanSwim) {
			return ((AnimalThatCanSwim) animal).canSwim();
		}
		return false;
	};

	// AnimalThatCanMakeSound predicate
	public static Predicate<Animal> ANIMAL_THAT_CAN_MAKE_SOUND_PREDICATE = animal -> {
		if (animal instanceof AnimalThatCanMakeSound) {
			return ((AnimalThatCanMakeSound) animal).canSing();
		}
		return false;
	};

	// AnimalThatCanWalk predicate
	public static Predicate<Animal> ANIMAL_THAT_CAN_WALK_PREDICATE = animal -> {
		if (animal instanceof AnimalThatCanWalk) {
			return ((AnimalThatCanWalk) animal).canWalk();
		}
		return false;
	};

	// AnimalThatCanFly predicate
	public static Predicate<Animal> ANIMAL_THAT_CAN_FLY_PREDICATE = animal -> {
		if (animal instanceof AnimalThatCanFly) {
			// check canFly() execution, because some may return false (i.e. overriden, e.g.
			// butterfly when in different life-cycle state).
			return ((AnimalThatCanFly) animal).canFly();
		}
		return false;
	};

	public static int countAnimalThatCanSwim(List<Animal> animalList) {
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_SWIM_PREDICATE);
	}

	public static int countAnimalThatCanSing(List<Animal> animalList) {
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_MAKE_SOUND_PREDICATE);
	}

	public static int countAnimalThatCanWalk(List<Animal> animalList) {
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_WALK_PREDICATE);
	}

	public static int countAnimalThatCanFly(List<Animal> animalList) {
		return countAnimals(animalList, Utils.ANIMAL_THAT_CAN_FLY_PREDICATE);
	}

	public static int countAnimals(List<Animal> animalList, Predicate<Animal> predicate) {
		return animalList.stream().filter(predicate).collect(Collectors.toList()).size();
	}

}
