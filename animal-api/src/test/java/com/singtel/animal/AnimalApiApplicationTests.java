package com.singtel.animal;

import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.singtel.animal.config.Config;
import com.singtel.animal.model.Animal;
import com.singtel.animal.util.Utils;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AnimalApiApplicationTests {

	@Autowired
	TestRestTemplate testRestTemplate;

	@Autowired
	Config config;

	@Test
	public void testApiAnimals() {

		// REST call for /api/animals
		ResponseEntity<List> responseAllAnimals = testRestTemplate.getForEntity("/api/animals", List.class, new HashMap<>());
		List animalsFromRest = responseAllAnimals.getBody();

		// assert that REST call is successful
		assertThat(responseAllAnimals.getStatusCode(), Matchers.equalTo(HttpStatus.OK));

		// Data from config
		List<Animal> animalsFromConfig = config.animals();

		// assert REST v DB
		assertThat(animalsFromRest.size(), Matchers.equalTo(animalsFromConfig.size()));

	}

	@Test
	public void testApiAnimalsThatCanFly() {

		// REST call for /api/animalsThatCanFly
		ResponseEntity<List> responseAllAnimals = testRestTemplate.getForEntity("/api/animalsThatCanFly", List.class, new HashMap<>());
		List animalsFromRest = responseAllAnimals.getBody();

		// assert that REST call is successful
		assertThat(responseAllAnimals.getStatusCode(), Matchers.equalTo(HttpStatus.OK));

		// Data from config
		List<Animal> animalsFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_FLY_PREDICATE).collect(Collectors.toList());

		// assert REST v DB
		assertThat(animalsFromRest.size(), Matchers.equalTo(animalsFromConfig.size()));

	}

	@Test
	public void testApiAnimalsThatCanSwim() {

		// REST call for /api/animalsThatCanSwim
		ResponseEntity<List> responseAllAnimals = testRestTemplate.getForEntity("/api/animalsThatCanSwim", List.class, new HashMap<>());
		List animalsFromRest = responseAllAnimals.getBody();

		// assert that REST call is successful
		assertThat(responseAllAnimals.getStatusCode(), Matchers.equalTo(HttpStatus.OK));

		// Data from config
		List<Animal> animalsFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_SWIM_PREDICATE).collect(Collectors.toList());

		// assert REST v DB
		assertThat(animalsFromRest.size(), Matchers.equalTo(animalsFromConfig.size()));

	}

	@Test
	public void testApiAnimalsThatCanWalk() {

		// REST call for /api/animalsThatCanWalk
		ResponseEntity<List> responseAllAnimals = testRestTemplate.getForEntity("/api/animalsThatCanWalk", List.class, new HashMap<>());
		List animalsFromRest = responseAllAnimals.getBody();

		// assert that REST call is successful
		assertThat(responseAllAnimals.getStatusCode(), Matchers.equalTo(HttpStatus.OK));

		// Data from config
		List<Animal> animalsFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_WALK_PREDICATE).collect(Collectors.toList());

		// assert REST v DB
		assertThat(animalsFromRest.size(), Matchers.equalTo(animalsFromConfig.size()));

	}

	@Test
	public void testApiAnimalsThatCanSing() {

		// REST call for /api/animalsThatCanSing
		ResponseEntity<List> responseAllAnimals = testRestTemplate.getForEntity("/api/animalsThatCanSing", List.class, new HashMap<>());
		List animalsFromRest = responseAllAnimals.getBody();

		// assert that REST call is successful
		assertThat(responseAllAnimals.getStatusCode(), Matchers.equalTo(HttpStatus.OK));

		// Data from config
		List<Animal> animalsFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_MAKE_SOUND_PREDICATE).collect(Collectors.toList());

		// assert REST v DB
		assertThat(animalsFromRest.size(), Matchers.equalTo(animalsFromConfig.size()));

	}

	@Test
	public void testApiCountAnimals() {

		// REST call for /api/countAnimals
		Integer countResponse = testRestTemplate.getForObject("/api/countAnimals", Integer.class);

		// Data from config
		int countFromConfig = config.animals().size();

		// assert REST v DB
		assertThat(countResponse, Matchers.equalTo(countFromConfig));

	}

	@Test
	public void testApiCountAnimalsThatCanFly() {

		// REST call for /api/countAnimalsThatCanFly
		Integer countResponse = testRestTemplate.getForObject("/api/countAnimalsThatCanFly", Integer.class);

		// Data from config
		int countFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_FLY_PREDICATE).collect(Collectors.toList()).size();

		// assert REST v DB
		assertThat(countResponse, Matchers.equalTo(countFromConfig));

	}

	@Test
	public void testApiCountAnimalsThatCanSwim() {

		// REST call for /api/countAnimalsThatCanSwim
		Integer countResponse = testRestTemplate.getForObject("/api/countAnimalsThatCanSwim", Integer.class);

		// Data from config
		int countFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_SWIM_PREDICATE).collect(Collectors.toList()).size();

		// assert REST v DB
		assertThat(countResponse, Matchers.equalTo(countFromConfig));

	}

	@Test
	public void testApiCountAnimalsThatCanWalk() {

		// REST call for /api/countAnimalsThatCanWalk
		Integer countResponse = testRestTemplate.getForObject("/api/countAnimalsThatCanWalk", Integer.class);

		// Data from config
		int countFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_WALK_PREDICATE).collect(Collectors.toList()).size();

		// assert REST v DB
		assertThat(countResponse, Matchers.equalTo(countFromConfig));

	}

	@Test
	public void testApiCountAnimalsThatCanSing() {

		// REST call for /api/countAnimalsThatCanSing
		Integer countResponse = testRestTemplate.getForObject("/api/countAnimalsThatCanSing", Integer.class);

		// Data from config
		int countFromConfig = config.animals().stream().filter(Utils.ANIMAL_THAT_CAN_MAKE_SOUND_PREDICATE).collect(Collectors.toList()).size();

		// assert REST v DB
		assertThat(countResponse, Matchers.equalTo(countFromConfig));

	}

}
