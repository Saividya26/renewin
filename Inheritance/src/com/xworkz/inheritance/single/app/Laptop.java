package com.xworkz.inheritance.single.app;

public class Laptop extends Computer{
	
	public String brand="DELL";
	
	public Laptop()
	{
		System.out.println("No arguments");
		System.out.println("brand is:"+brand);
	}
	public void startLaptop()
	{
		System.out.println("invoking start laptop in laptop");
	}

}
