package com.xworkz.inheritance.fifth.app;

public class Seed 
{
  public String seedName="Oak";
  public int lifeSpan=10;
	public Seed()
	{
		
		System.out.println("No args const of seed");
		System.out.println("Name:"+lifeSpan);
	}
	
	public void grow()
	{
		System.out.println("Invkoing growPlant in Plant");
	}

}
