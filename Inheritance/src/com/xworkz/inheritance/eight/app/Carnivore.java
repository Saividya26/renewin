package com.xworkz.inheritance.eight.app;
public class Carnivore extends Mammal{
	
	
	public String name;
	public Carnivore()
	{
		System.out.println("Invoking no args Carnivore");
		System.out.println("Name is:"+name);
	}
	
	public void eatMeat()
	{
		System.out.println("Invoking eatMeat");
	}


}