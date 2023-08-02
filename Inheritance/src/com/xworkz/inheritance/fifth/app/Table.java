package com.xworkz.inheritance.fifth.app;

public class Table extends Furniture {

	public int price=890000;

	public Table()
	{
		
		System.out.println("No args const of Table");
		System.out.println("Price :"+price);
	}
	
	public void keepThings()
	{
		System.out.println("Invkoing keepThings");
	}
}
