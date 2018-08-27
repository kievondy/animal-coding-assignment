package com.singtel.animal;

import com.singtel.animal.model.Bird;
import com.singtel.animal.model.Chicken;
import com.singtel.animal.model.Duck;
import com.singtel.animal.model.Rooster;

public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println(bird.walk());
		System.out.println(bird.fly());
		System.out.println(bird.sing());

		System.out.println(new Duck().sing());

		System.out.println(new Chicken().sing());
		
		System.out.println(new Rooster().sing());
	}

}
