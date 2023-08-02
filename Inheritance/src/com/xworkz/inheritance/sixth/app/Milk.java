package com.xworkz.inheritance.sixth.app;

public class Milk extends Cow{
	
	public int price=100;
	
	public Milk()
	{
		
		System.out.println("No args const of Milk");
		System.out.println("Price:"+price);
	}
	
	public void givesProtien()
	{
		System.out.println("Invkoing givesProtien");
	}

}
