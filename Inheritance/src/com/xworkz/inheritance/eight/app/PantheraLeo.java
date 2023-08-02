package com.xworkz.inheritance.eight.app;

public class PantheraLeo extends Panthera{
	

	public String family;
	public PantheraLeo()
	{
		System.out.println("Invoking no args PantheraLeo");
		System.out.println("Family is:"+family);
	}
	
	public void sleep()
	{
		System.out.println("Invoking sleep");
	}

}