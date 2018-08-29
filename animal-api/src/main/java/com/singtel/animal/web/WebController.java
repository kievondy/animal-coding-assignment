package com.singtel.animal.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.animal.config.Config;
import com.singtel.animal.model.Animal;
import com.singtel.animal.util.Utils;

@RestController
@RequestMapping("/api")
public class WebController {

	@Autowired
	Config config;

	@GetMapping("/animals")
	public List<Animal> animals() {
		return config.animals();
	}

	@GetMapping("/countAnimals")
	public int countAnimals() {
		return animals().size();
	}

	@GetMapping("/animalsThatCanFly")
	public List<Animal> animalsThatCanFly() {
		List<Animal> animals = config.animals();
		return animals.stream().filter(Utils.ANIMAL_THAT_CAN_FLY_PREDICATE).collect(Collectors.toList());
	}

	@GetMapping("/countAnimalsThatCanFly")
	public int countAnimalsThatCanFly() {
		return animalsThatCanFly().size();
	}

	@GetMapping("/animalsThatCanSwim")
	public List<Animal> animalsThatCanSwim() {
		List<Animal> animals = config.animals();
		return animals.stream().filter(Utils.ANIMAL_THAT_CAN_SWIM_PREDICATE).collect(Collectors.toList());
	}

	@GetMapping("/countAnimalsThatCanSwim")
	public int countAnimalsThatCanSwim() {
		return animalsThatCanSwim().size();
	}

	@GetMapping("/animalsThatCanWalk")
	public List<Animal> animalsThatCanWalk() {
		List<Animal> animals = config.animals();
		return animals.stream().filter(Utils.ANIMAL_THAT_CAN_WALK_PREDICATE).collect(Collectors.toList());
	}

	@GetMapping("/countAnimalsThatCanWalk")
	public int countAnimalsThatCanWalk() {
		return animalsThatCanWalk().size();
	}

	@GetMapping("/animalsThatCanSing")
	public List<Animal> animalsThatCanSing() {
		List<Animal> animals = config.animals();
		return animals.stream().filter(Utils.ANIMAL_THAT_CAN_MAKE_SOUND_PREDICATE).collect(Collectors.toList());
	}

	@GetMapping("/countAnimalsThatCanSing")
	public int countAnimalsThatCanSing() {
		return animalsThatCanSing().size();
	}

}
