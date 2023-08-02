package com.xworkz.inheritance.seventh.app;

public class TeslaModelSLongRange extends TeslaModelS {
	
	public String range="Long";
	
	public TeslaModelSLongRange()
	{
		System.out.println("No args const of TeslaModelSLongRange");
		System.out.println("Range :"+range);
	}
	
	public void chrgingCapacity()
	{
		System.out.println("Invkoing chrgingCapacity");
	}

}