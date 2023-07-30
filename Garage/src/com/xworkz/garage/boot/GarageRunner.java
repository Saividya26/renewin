package com.xworkz.garage.boot;

import com.xworkz.garage.app.Garage;

public class GarageRunner {
public static void main(String[] args) {
		
		System.out.println("Running main in GarageRunner..");
		Garage garage=new Garage();
		garage.service();
		garage.info();

	}


}
