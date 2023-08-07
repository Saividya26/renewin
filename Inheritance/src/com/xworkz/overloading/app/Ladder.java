package com.xworkz.overloading.app;

public class Ladder {
	public void fold()
	{
		System.out.println("Invoking fold with no args");
		fold("Gray",2000);
	}
	public void fold(String color)
	{
		System.out.println("Invoking fold with String args");
		System.out.println("Color is:"+color);
	}

	public void fold(double price)
	{
		System.out.println("Invoking fold with double args");
		System.out.println("Price is:"+price);
	}

	public void fold(String color,double price)
	{
		System.out.println("Invoking fold with String,double args");
		fold(color);
		fold(price);
	}


}
