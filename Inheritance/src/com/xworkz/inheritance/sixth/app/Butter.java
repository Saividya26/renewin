package com.xworkz.inheritance.sixth.app;

public class Butter extends ButterMilk {
	
	public String brand="Nandini";
	
	public Butter()
	{
		
		System.out.println("No args const of Tree");
		System.out.println("Brand:"+brand);
	}
	
	public void giveTaste()
	{
		System.out.println("Invkoing giveTaste");
	}

}
