package com.xworkz.inheritance.eight.app;

	
	public class Felidae extends Carnivore{
		
		
		public String namefamily="Mammal";
		public Felidae()
		{
			System.out.println("Invoking no args Felidae");
			System.out.println("Name  familyis:"+namefamily);
		}
		
		public void eatFood()
		{
			System.out.println("Invoking eatFood");
		}

}
