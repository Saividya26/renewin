package com.xworkz.chaining.rope.boot;

import com.xworkz.chaining.rope.app.NylonRope;

public class RopeRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in RopeRunner");
		
		NylonRope nylon=new NylonRope();
		System.out.println(nylon.brand);
		System.out.println(nylon.color);
		System.out.println(nylon.price);
		System.out.println(nylon.size);
		
		System.out.println("\n");
		
		NylonRope nylon1=new NylonRope("All Gear",799,"Green",'S');
		System.out.println(nylon1.brand);
		System.out.println(nylon1.color);
		System.out.println(nylon1.price);
		System.out.println(nylon1.size);

	}

}
