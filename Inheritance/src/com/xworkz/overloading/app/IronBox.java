package com.xworkz.overloading.app;

public class IronBox {
	
	public void iron() {
		System.out.println("running iron with no arguments");
		iron("philips",260);
	}
	
	public void iron(String name)
	{
		System.out.println("invoking iron with string argument");
		System.out.println("name is:"+name);
	}
	public void iron(double price)
	{
		System.out.println("invoking iron with double argument");
		System.out.println("price is:"+price);
	}
	public void iron(String name,double price)
	{
		System.out.println("invoking iron with string argument");
		iron(name);
		iron(price);
	}



}
