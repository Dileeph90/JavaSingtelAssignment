package com.singtel.animal.kingdom.section.a.four;

public class ParrotLivingWithDog extends ParrotDecorator {

	public ParrotLivingWithDog(Bird b) {
		super(b);
	}

	@Override
	public String sing(){
		String sing = "Woof, woof";
		System.out.println(sing);
		return sing;
	}
}
