package com.xworkz.overriding.app;

public class BlackBox extends Theater{
	@Override
	public void watchMovies() {
		System.out.println("Invoking watchMovies in BlackBox");
	}

}
