package com.singtel.animal.kingdom.section.e;

public class ParrotLivingWithDog extends ParrotDecorator {

	public ParrotLivingWithDog(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println(" Woof, woof");
	}
}
