package com.xworkz.overloading.app;

public class Gadget {
	
	public void connect()
	{
		System.out.println("Invoking connect with no args");
		connect("Noise",6000);
	}
	public void connect(String brand)
	{
		System.out.println("Invoking connect with String args");
		System.out.println("Brand is:"+brand);
	}
	public void connect(int price)
	{
		System.out.println("Invoking connect with int args");
		System.out.println("Price is:"+price);
	}
	public void connect(String brand,int price)
	{
		System.out.println("Invoking connect with String,int args");
		connect(brand);
		connect(price);
	}

}
