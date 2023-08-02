package com.xworkz.inheritance.sixth.app;

public class ButterMilk extends Curd {
	
	public int price=90;
	public ButterMilk()
	{
		
		System.out.println("No args const of ButterMilk");
		System.out.println("Price:"+price);
	}
	
	public void givesEnergy()
	{
		System.out.println("Invkoing givesEnergy");
	}

}
