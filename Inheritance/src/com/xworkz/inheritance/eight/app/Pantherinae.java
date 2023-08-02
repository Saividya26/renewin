package com.xworkz.inheritance.eight.app;

public class Pantherinae extends Felidae{
	
	
	public int lifSpan=200;
	public Pantherinae()
	{
		System.out.println("Invoking no args Pantherinae");
		System.out.println("lifSpan is:"+lifSpan);
	}
	
	public void bark()
	{
		System.out.println("Invoking bark");
	}

}
