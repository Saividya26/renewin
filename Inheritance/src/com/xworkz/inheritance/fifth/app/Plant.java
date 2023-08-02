package com.xworkz.inheritance.fifth.app;

public class Plant extends Seed{
	public int lifeSpan=10;
	public Plant()
	{
		
		System.out.println("No args const of plant");
		System.out.println("Life Span:"+lifeSpan);
	}
	
	public void growPlant()
	{
		System.out.println("Invkoing growPlant in Plant");
	}

}
