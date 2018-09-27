package com.singtel.animal.kingdom.bonus;

import java.util.HashMap;

import com.singtel.animal.kingdom.bonus.Animal.Sex;


public class TestSecBonus {
	public static void main(String[] args) {
		Chicken c = new Chicken();
		c.setSex(Sex.MALE);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("MALAYALAM", "Kokorokooko");
		Chicken.languageTranslator = map;
		
		System.out.println("Native language is Malayalam");
		c.singInNativeTongue("MALAYALAM");
	}
}
