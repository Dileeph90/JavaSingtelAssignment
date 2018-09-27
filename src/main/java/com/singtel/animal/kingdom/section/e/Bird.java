package com.singtel.animal.kingdom.section.e;

public class Bird extends Animal implements WalkIF, SingIF {

	public void sing() {
		System.out.println("I am Singing");		
		
	}

	public void walk() {
		System.out.println("I am walking");
		
	}
}
