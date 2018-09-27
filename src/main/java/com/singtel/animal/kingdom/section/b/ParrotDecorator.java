package com.singtel.animal.kingdom.section.b;

public class ParrotDecorator implements SingIF{

	protected Bird bird;
	
	public ParrotDecorator(Bird b){
		this.bird=b;
	}
	
	public void sing() {
		this.bird.sing();
	}

}