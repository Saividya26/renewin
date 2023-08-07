package com.xworkz.overloading.app;

public class Plier {
	
	public void remove()
	{
		System.out.println("Invoking remove with no args");
		remove("Locking",800);
	}
	public void remove(String type)
	{
		System.out.println("Invoking remove with String args");
		System.out.println("Type is:"+type);
	}
	public void remove(int price)
	{
		System.out.println("Invoking remove with int args");
		System.out.println("Price is:"+price);
	}
	public void remove(String type,int price)
	{
		System.out.println("Invoking remove with String,int args");
		remove(type);
		remove(price);
	}

}
