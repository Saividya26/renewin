package com.xworkz.hotel.app;

public class Hotel {
	public String hotelName="Empire Hotel";
	public Cook cook=new Cook();
	
	public void serveFood()
	{
		System.out.println("Running serveFood in Hotel");
		if(this.cook!=null)
		{
			this.cook.preparingFood();
			this.cook.clean();
		}
		else
		{
			System.err.println("Null Exception Pointer Encountered...");
		}
	}
	
	public void info()
	{
		 System.out.println("Browser Name is:"+hotelName);
	}
	


}
