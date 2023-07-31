package com.xworkz.garage.app;



	public class Garage {
		public String location="goa";
		Mechanic mechanic = new Mechanic();
		
		public void service()
		{
			System.out.println("Running service..");
	        if(this.mechanic!=null)
	        {
	        	this.mechanic.repair();
	        	this.mechanic.wash();
	        }
	        else
	        {
	        	System.out.println("Error.......");
	        }
		}
		
		public void info()
		{
			System.out.println("Location is:"+location);
		}

	

}
