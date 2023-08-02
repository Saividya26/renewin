package com.xworkz.inheritance.eight.app;


public class PantheraLeoAfricanLion extends PantheraLeo{
	
	
	public int age=800;
	public PantheraLeoAfricanLion()
	{
		System.out.println("Invoking no args PantheraLeoAfricanLion");
		System.out.println("Age is:"+age);
	}
	
	public void roar()
	{
		System.out.println("Invoking roar");
	}

}