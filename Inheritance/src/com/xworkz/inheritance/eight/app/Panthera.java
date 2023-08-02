package com.xworkz.inheritance.eight.app;

public class Panthera extends Pantherinae{
	
	
	public String family;
	public Panthera()
	{
		System.out.println("Invoking no args Panthera");
		System.out.println("Family is:"+family);
	}
	
	public void run()
	{
		System.out.println("Invoking run");
	}
}