package com.singtel.animal.kingdom.section.b;

import com.singtel.animal.kingdom.section.b.Fish.Colour;
import com.singtel.animal.kingdom.section.b.Fish.Size;

public class TestSecB {
	public static void main(String[] args) {
		Fish fish = new Fish();
		System.out.println("Fish");
		fish.swim();
		
		ClownFish clownFish = new ClownFish(Size.SMALL, Colour.ORANGE);
		System.out.println("clownFish");
		clownFish.makeJokes();
		
		SharkFish sharkFish = new SharkFish(Size.LARGE, Colour.GREY);
		System.out.println("sharkFish");
		sharkFish.eat(clownFish);
	}
}
