package com.xworkz.overriding.app;

public class BlackCoal extends Coal{
	
@Override
public void burn() {
	System.out.println("Invoking burn in BlackCoal");
}

}