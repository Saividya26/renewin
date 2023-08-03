package com.xworkz.casting.chocolates.boot;

import com.xworkz.casting.chocolates.app.CaramelChocolate;
import com.xworkz.casting.chocolates.app.Chocolate;
import com.xworkz.casting.chocolates.app.ChocolateUtil;
import com.xworkz.casting.chocolates.app.DarkChocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Invoking main in  ChocolateRunner ");
		
		Chocolate chocolate=new Chocolate();
		DarkChocolate darkChocolate=new DarkChocolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil.run(caramelChocolate);
		ChocolateUtil.run(darkChocolate);
	}
	
}
