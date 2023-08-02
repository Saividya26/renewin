package com.xworkz.inheritance.eight.app;


	
	public class Mammal extends Vertebrate{
		
		
		
		public String example="Rat";
		public Mammal()
		{
			System.out.println("Invoking no args Mammal");
			System.out.println("Eaxmplee is:"+example);
		}
		
		public void bite()
		{
			System.out.println("Invoking bite");
		}

}
