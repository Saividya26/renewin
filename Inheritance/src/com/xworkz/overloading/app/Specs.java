package com.xworkz.overloading.app;

public class Specs {
	
	public void lens()
	{
		System.out.println("Invoking lens having no arguments");
		lens("convex",350);
	}
	
	public void lens(int price)
	{
		System.out.println("Invoking lens having int arguments");
		System.out.println("price :"+price);
	}
	public void lens(String type)
	{
		System.out.println("Invoking lens having string arguments");
		System.out.println("type is :"+type);
	}
	public void lens(String type,int price)
	{
		System.out.println("Invoking lens having string,int arguments");
		lens(type);
		lens(price);
	}

}
