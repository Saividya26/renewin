package com.xworkz.overriding.app;

public class BlackTicket extends Ticket{
	@Override
	public void tear() {
		System.out.println("Invoking tear in BlackTicket");
	}

}
