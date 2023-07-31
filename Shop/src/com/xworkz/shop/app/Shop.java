package com.xworkz.shop.app;

public class Shop {
	String name;
	SalesMan salesMan=new SalesMan();
	
	public void store()
	
	{
		System.out.println("Running store in Shop");
		if(this.salesMan!=null)
		{
			this.salesMan.maintain();
			this.salesMan.sales();
		}
		else
		{
			System.out.println("Null pointer Exception");
		}
	}
	public void info()
	{
	System.out.println("Shop Name is: "+name);
	}


}
