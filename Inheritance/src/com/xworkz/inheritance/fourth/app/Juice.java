package com.xworkz.inheritance.fourth.app;

public class Juice extends Fruit{
	
	public int price=90;
	public Juice()
	{
		
		System.out.println("No args const of Juice");
		System.out.println("Price:"+price);
	}
	
	public void drink()
	{
		System.out.println("Invkoing Drink ");
	}

}
