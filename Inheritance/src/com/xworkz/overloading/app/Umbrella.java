package com.xworkz.overloading.app;

public class Umbrella {
	
	public void protect()
	{
		System.out.println("Invoking protect with no args");
		protect("Black",500);
	}
	public void protect(double price)
	{
		System.out.println("Invoking protect with no args");
		System.out.println("Price is:"+price);
	}

	public void protect(String color)
	{
		System.out.println("Invoking protect with no args");
		System.out.println("Color is:"+color);
	}

	public void protect(String color,double price)
	{
		System.out.println("Invoking protect with no args");
		protect(price);
		protect(color);
	}


}
