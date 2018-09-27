package com.singtel.animal.kingdom.section.a.four;

public class ParrotLivingWithCat extends ParrotDecorator {

	public ParrotLivingWithCat(Bird b) {
		super(b);
	}

	@Override
	public String sing(){
		String sing = "Meow, meow";
		System.out.println(sing);
		return sing;
	}
}
