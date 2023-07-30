package com.xworkz.powerbank.boot;

import com.xworkz.powerbank.app.PowerBank;

public class PowerbankRunner {

	public static void main(String[] args) {
		
		PowerBank powerBank=new PowerBank();
		powerBank.chargePhone();
		powerBank.information();
			

	}

}
