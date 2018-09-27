package com.singtel.animal.kingdom.section.a.two;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	public static void main(String[] args) {
		Duck duck = new Duck();
		System.out.println("Duck");
		duck.sing();
		duck.swim();

		Chicken chicken = new Chicken();
		System.out.println("Chicken");
		chicken.walk();
		chicken.sing();
	}

	@Test
	public void singDuck() {
		Duck duck = new Duck();
		String sing = "Quack, quack";
		assertEquals(sing, duck.sing());
	}

	@Test
	public void swimDuck() {
		Duck duck = new Duck();
		String swim = "I can swim";
		assertEquals(swim, duck.swim());
	}

	@Test
	public void singChicken() {
		Chicken chicken = new Chicken();
		String sing = "Cluck, cluck";
		assertEquals(sing, chicken.sing());
	}

}
