package com.xworkz.inheritance.fifth.app;

public class Furniture extends Tree {
	
	public String name;
	
	public Furniture()
	{

		System.out.println("No args const of Furniture");
		System.out.println("Name is:"+name);
	}
	
	public void make()
	{
		System.out.println("Invoking make in Furniture");
	}

}
