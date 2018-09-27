/**
 * 
 */
package com.singtel.animal.kingdom.section.a.one.a;

/**
 * @author dileep
 * Base class for all Animal genre
 */
class Animal {
	/**
	 * Method for implementing walking
	 */
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	/**
	 *@return void
	 *Method for implementing flying 
	 */
	void fly() {
		System.out.println("I am flying");
	}

	/**
	 * @return String
	 * Method for implementing Singing
	 */
	String sing() {
		String sing = "I am Singing";
		System.out.println(sing);
		return sing;
	}
}

public class Solution {

	/**
	 * Main method to start the application
	 */
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
