package com.xworkz.powerbank.app;

public class PowerBank {
	
	public String brand;
	public Battery battery=new Battery();
	
	public void chargePhone()
	{
		System.out.println("Invoking phone in the battery");
		if(this.battery!=null)
		{
		this.battery.charge();
		this.battery.backup();
		}
		else
		{
			System.err.println("null pointer exception encountered");
		}
	}
	public void information()
	{
		String brand="ambarne";
		System.out.println("the brand is:"+brand);
	}

}
