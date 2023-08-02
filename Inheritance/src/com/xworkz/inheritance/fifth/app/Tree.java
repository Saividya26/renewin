package com.xworkz.inheritance.fifth.app;

public class Tree extends Plant{
	
public String type;
	
	public Tree()
	{
		
		System.out.println("No args const of Tree");
		System.out.println("Type:"+type);
	}
	
	public void givesOxygen()
	{
		System.out.println("Invkoing givesOxygen in Tree");
	}

}
