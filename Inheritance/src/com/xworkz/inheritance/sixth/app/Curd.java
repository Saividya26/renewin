package com.xworkz.inheritance.sixth.app;

public class Curd extends Milk{
	public double quantity;
	
	public Curd()
	{
		
		System.out.println("No args const of Curd");
		System.out.println("Quantity :"+quantity);
	}
	
	public void makeButterMilk()
	{
		System.out.println("Invkoing ButterMilk");
	}

}
