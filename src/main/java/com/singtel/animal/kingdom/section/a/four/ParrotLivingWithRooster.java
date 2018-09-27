package com.singtel.animal.kingdom.section.a.four;

public class ParrotLivingWithRooster extends ParrotDecorator {

	public ParrotLivingWithRooster(Bird b) {
		super(b);
	}

	@Override
	public String sing(){
		String sing = "Cock-a-doodle-doo";
		System.out.println(sing);
		return sing;
	}
}
