package com.xworkz.inheritance.eight.app;

public class Vertebrate extends Animal{
	
	public String type="Fish";
	
	public Vertebrate()
	{
		System.out.println("Invoking no args Vertebrate");
		System.out.println("Type is:"+type);
	}
	
	public void eat()
	{
		System.out.println("Invoking eat");
	}


}
