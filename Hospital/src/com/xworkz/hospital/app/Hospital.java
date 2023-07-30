package com.xworkz.hospital.app;

public class Hospital {

	
	public String hospitalName="Apolo";
	Doctor doctor=new Doctor();
	Nurse nurse=new Nurse();
	Patient patient=new Patient();
	

	public void service()
	{
		System.out.println("Running Doctor.....");
	if((this.doctor!=null)&&(this.nurse!=null)&&(this.patient!=null))
	{
		this.doctor.checkPatients();
		this.doctor.treatment();
		this.nurse.caringPatients();
		this.nurse.giveTablets();
		this.patient.consultDoctors();
		this.patient.takeMedicine();
	}
	else
	{
		System.err.println("Null Pointer Exceprion Encountered...");
	}

}
	public void info()
	{
		System.out.println("Hospital Name is:"+hospitalName);
	}

}
