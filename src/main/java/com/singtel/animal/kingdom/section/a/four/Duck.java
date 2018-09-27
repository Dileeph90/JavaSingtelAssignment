package com.singtel.animal.kingdom.section.a.four;

import com.singtel.animal.kingdom.section.a.one.b.Bird;

public class Duck extends Bird  {
	
	/* (non-Javadoc)
	 * Special method for Duck for singing
	 */
	@Override
	public String sing(){
		String sing = "Quack, quack";
		System.out.println(sing);
		return sing;
	}
	
	public String swim() {
		String swim = "I can swim";
		System.out.println(swim);
		return swim;
	}
	
}
