package com.singtel.animal.kingdom.section.a.four;

public class Bird extends Animal implements WalkIF,FlyIF,SingIF {

	public void fly() {
		System.out.println("I am flying");
	}

	public void walk() {
		System.out.println("I am walking");
	}

	public String sing() {
		String sing = "I am singing";
		System.out.println(sing);
		return sing;
	}

}
