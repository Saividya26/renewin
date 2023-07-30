package com.xworkz.hospital.boot;

import com.xworkz.hospital.app.Hospital;

public class DoctorRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in DoctorRunner");
		Hospital hospital=new Hospital();
		hospital.service();
		hospital.info();
	}


}
