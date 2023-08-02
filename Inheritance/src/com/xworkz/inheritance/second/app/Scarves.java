package com.xworkz.inheritance.second.app;

public class Scarves extends Wool{

	public String color = "blue";

	public Scarves()
	{
		System.out.println("No args const of Wool");
		System.out.println("Color is:"+color);
	}

	public void wear() {
		System.out.println("Invkoing wear in Scarves");
	}

}
