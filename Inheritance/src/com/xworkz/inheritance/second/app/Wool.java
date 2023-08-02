package com.xworkz.inheritance.second.app;

public class Wool extends Sheep {
	
	public int price=6000;
	
	public Wool()
	{
		System.out.println("No args const of Wool");
		System.out.println("Price is:"+price);
	}
	
	public void makeCloth()
	{
		System.out.println("Invkoing makeCloth in Wool");
	}


}
