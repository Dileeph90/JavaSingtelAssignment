package com.singtel.animal.kingdom.bonus;

public class Duck extends Bird implements SwimIF{
	@Override
	public void sing(){
		System.out.println("Quack, quack");
	}

	public void swim() {
		System.out.println("I can swim");
		
	}
}
