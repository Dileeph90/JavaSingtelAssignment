package com.singtel.animal.kingdom.section.a.two;

import com.singtel.animal.kingdom.section.a.one.b.Bird;

public class Chicken extends Bird {

   @Override
public String sing() {
	String sing = "Cluck, cluck";
	System.out.println(sing);
	return sing;
}
   @Override
	public void fly() {
		
	}
}
