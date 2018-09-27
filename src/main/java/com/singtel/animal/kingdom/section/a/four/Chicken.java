package com.singtel.animal.kingdom.section.a.four;

public class Chicken extends Bird {
	
	@Override
	public String sing() {
		String sound = "Cluck, cluck";
		if(this.getSex() == Sex.MALE){
			sound = "Cock-a-doodle-doo";
		}
		System.out.println(sound);
		return sound;
	}

}
