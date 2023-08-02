package com.xworkz.inheritance.third.app;

public class GrandChild extends Child
{

public int age=12;
	
	public GrandChild()
	{
		
		System.out.println("No args const of GrandChild");
		System.out.println("No of Childrens:"+age);
	}
	
	public void sing()
	{
		System.out.println("Invkoing sing in GrandChild");
	}

	

}
