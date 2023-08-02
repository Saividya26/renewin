package com.xworkz.inheritance.sixth.app;

public class Ghee extends Butter {
	
	
	public int price=900;
	
	public Ghee()
	{
		
		System.out.println("No args const of Ghee");
		System.out.println("Price:"+price);
	}
	
	public void makeSweet()
	{
		System.out.println("Invkoing make Sweet");
	}

}
