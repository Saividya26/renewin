package com.xworkz.chaining.rope.app;

public class NylonRope extends Rope{
	public NylonRope(String brand,int price,String color,char size)
	{
		super(brand,price,color,size);
	}
	
	public NylonRope()
	{
		super("Grainger",800,"black",'M');
	}

}
