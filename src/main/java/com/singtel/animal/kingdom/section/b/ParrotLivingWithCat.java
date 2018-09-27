package com.singtel.animal.kingdom.section.b;

public class ParrotLivingWithCat extends ParrotDecorator {

	public ParrotLivingWithCat(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Meow, meow");
	}
}
