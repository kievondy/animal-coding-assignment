package com.singtel.animal.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

@Configuration
public class Config {

	@Bean
	public List<Animal> animals() {
		
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

		return Arrays.asList(animals);

	}
}
