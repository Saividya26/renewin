package com.xworkz.chaining.diamond.boot;

import com.xworkz.chaining.diamond.app.KohinoorDiomand;

public class DiamondRunner {

	public static void main(String[] args) {
		
    System.out.println("Running DiomanRunner");
    KohinoorDiomand diamond=new KohinoorDiomand("Kiran Gems",980000,"Pink","Mumbai");
    System.out.println(diamond.brand);
    System.out.println(diamond.color);
    System.out.println(diamond.location);
    System.out.println(diamond.price);
    
   KohinoorDiomand kohinoor=new KohinoorDiomand();
    System.out.println(kohinoor.brand);
    System.out.println(kohinoor.color);
    System.out.println(kohinoor.location);
    System.out.println(kohinoor.price);
    

	}

}