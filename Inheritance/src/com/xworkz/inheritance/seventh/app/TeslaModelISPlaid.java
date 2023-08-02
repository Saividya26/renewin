package com.xworkz.inheritance.seventh.app;

public class TeslaModelSPlaid extends TeslaModelSLongRange 
{
	public String model;
	

	public TeslaModelSPlaid()
	{
		System.out.println("No args const of TeslaModelSPlaid");
		System.out.println("Model :"+model);
	}
	
	public void batteryCapacity()
	{
		System.out.println("Invkoing batteryCapacity");
	}

}
