package com.xworkz.overloading.app;

public class Hotel {
	
	public void cook()
	{
		System.out.println("Invoking cook having no arguments");
		cook("Masala mandi",2022);
	}
	
	public void cook(int since)
	{
		System.out.println("Invoking cook having int arguments");
		System.out.println("Since :"+since);
	}
	public void cook(String name)
	{
		System.out.println("Invoking cook having string arguments");
		System.out.println("Name is :"+name);
	}
	public void cook(String name,int since)
	{
		System.out.println("Invoking cook having string,int arguments");
		cook(name);
		cook(since);
	}

}
