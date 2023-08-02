package com.xworkz.inheritance.fourth.app;

public class Fruit extends Tree {
	
	public String color="Red";
	public Fruit()
	{
		
		System.out.println("No args const of Fruit");
		System.out.println("Color:"+color);
	}
	
	public void eat()
	{
		System.out.println("Invkoing eat in Fruit");
	}

}
