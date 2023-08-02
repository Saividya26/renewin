package com.xworkz.inheritance.seventh.app;

public class LandVehicle extends Vehicle {
	
	public String type;
	
	public LandVehicle()
	{
		System.out.println("No args const of LandVehicle");
		System.out.println("Type :"+type);
	}
	
	public void start()
	{
		System.out.println("Invkoing start");
	}

}
