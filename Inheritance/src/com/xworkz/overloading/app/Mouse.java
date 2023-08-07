package com.xworkz.overloading.app;

public class Mouse {
	
	public void select()
	{
		System.out.println("Invoking select with no args");
		select(true,4);
	}
	
	public void select(boolean isWireless)
	{
		System.out.println("Invoking select with boolean args");
		System.out.println("Is wirelelss mouse:"+isWireless);
	}
	
	public void select(int noOfButtons)
	{
		System.out.println("Invoking select with int args");
		System.out.println("No of buttons are:"+noOfButtons);
	}
	
	public void select(boolean isWireless,int noOfButtons)
	{
		System.out.println("Invoking select with boolean,int args");
		select(isWireless);
		select(noOfButtons);
	}

}
