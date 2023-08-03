package com.xworkz.casting.showroom.app;

public class ShowroomUtil extends Showroom {

	public static void run(Showroom showroom)
	{
	
		
		if(showroom instanceof WatchShowroom)
		{
			System.out.println("Invoking WatchShowroom");
			WatchShowroom watchShowroom=(WatchShowroom)showroom;
			System.out.println(watchShowroom.location);
			System.out.println(watchShowroom.since);
			watchShowroom.discount();
			watchShowroom.sale();
			System.out.println("\n");
			}
		

		if(showroom instanceof MobileShowroom)
		{
			System.out.println("Invoking MobileShowroom");
			MobileShowroom mobileShowroom=(MobileShowroom)showroom;
			System.out.println(mobileShowroom.location);
			System.out.println(mobileShowroom.price);
			mobileShowroom.free();
			mobileShowroom.sale();
			System.out.println("\n");
		}
		
		
	}

}
