package com.xworkz.inheritance.seventh.app;

public class TeslaModelS extends ElectricCar {
	
	public double price=988888;
	

	public TeslaModelS()
	{
		System.out.println("No args const of TeslaModelS");
		System.out.println("Price :"+price);
	}
	
	public void activateSpoiler()
	{
		System.out.println("Invkoing activateSpoiler");
	}

}
