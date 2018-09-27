package com.singtel.animal.kingdom.section.a.four;

public class ParrotDecorator implements SingIF,FlyIF,WalkIF{

	protected Bird bird;
	
	public ParrotDecorator(Bird b){
		this.bird=b;
	}
	
	public String sing() {
		this.bird.sing();
		return null;
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

	public void walk() {
		// TODO Auto-generated method stub
		
	}

}