package com.singtel.animal.kingdom.section.a.one.a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	/**
	 * Junit test case for testing the method Sing() in Bird class
	 */
	@Test
	public void testSing() {
		Bird bird = new Bird();
		String sing = "I am Singing";
		assertEquals(sing, bird.sing());
	}

}
