package com.singtel.animal;

import com.singtel.animal.model.Bird;

public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println(bird.walk());
		System.out.println(bird.fly());
		System.out.println(bird.sing());
	}

}
