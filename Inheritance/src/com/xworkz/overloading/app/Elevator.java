package com.xworkz.overloading.app;

public class Elevator { 
	
	public void lift()
	{
		System.out.println("Invoking materian with no args");
		lift("Steel",9000);
	}
	public void lift(String material)
	{
		System.out.println("Invoking materian with String args");
		System.out.println("Material is:"+material);
	}
	
	public void lift(double price)
	{
		System.out.println("Invoking materian with String args");
		System.out.println("Price:"+price);
	}
	
	public void lift(String material, double price)
	{
		System.out.println("Invoking materian with String, double args");
		lift(material);
		lift(price);
	}

}
