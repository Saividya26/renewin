package com.xworkz.inheritance.fourth.app;

public class Seed {

	public String seedName="Pomegranate";
	
	public Seed()
	{
		
		System.out.println("No args const of Seed");
		System.out.println("No of Seed name:"+seedName);
	}
	
	public void grow()
	{
		System.out.println("Invkoing growPlant in Seed");
	}

}
