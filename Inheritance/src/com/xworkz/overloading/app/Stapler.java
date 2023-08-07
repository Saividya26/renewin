package com.xworkz.overloading.app;

public class Stapler {
	
	public void joinPaper()
	{
		System.out.println("Invoking joinPAper with no args");
		joinPaper(100,"Mini");
	}
	
	public void joinPaper(double price)
	{
		System.out.println("Invoking joinPAper with no args");
		System.out.println("Price:"+price);
	}
	
	public void joinPaper(String style)
	{
		System.out.println("Invoking joinPAper with no args");
		System.out.println("Style:"+style);
	}
	
	public void joinPaper(double price,String style)
	{
		System.out.println("Invoking joinPAper with no args");
		joinPaper(price);
		joinPaper(style);
	}

}
