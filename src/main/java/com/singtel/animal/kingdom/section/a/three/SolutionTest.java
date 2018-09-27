package com.singtel.animal.kingdom.section.a.three;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.animal.kingdom.section.a.three.Animal.Sex;

public class SolutionTest {

	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		chicken.setSex(Sex.FEMALE);
		System.out.println("Chicken");
		chicken.sing();
		Chicken rooster = new Chicken();
		rooster.setSex(Sex.MALE);
		System.out.println("Rooster");
		rooster.sing();
	}
	
	@Test
	public void singChicken() {
		Chicken chicken = new Chicken();
		chicken.setSex(Sex.FEMALE);
		String sing = "Cluck, cluck";
		assertEquals(sing, chicken.sing());
	}
	
	@Test
	public void singRooster() {
		Chicken chicken = new Chicken();
		chicken.setSex(Sex.MALE);
		String sing = "Cock-a-doodle-doo";
		assertEquals(sing, chicken.sing());
	}
}
