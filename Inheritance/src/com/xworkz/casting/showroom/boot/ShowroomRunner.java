package com.xworkz.casting.showroom.boot;

import com.xworkz.casting.showroom.app.MobileShowroom;
import com.xworkz.casting.showroom.app.Showroom;
import com.xworkz.casting.showroom.app.ShowroomUtil;
import com.xworkz.casting.showroom.app.WatchShowroom;

public class ShowroomRunner {

	public static void main(String[] args) {

		Showroom showroom = new Showroom();
		MobileShowroom mobileShowroom = new MobileShowroom();
		WatchShowroom watchShowroom=new WatchShowroom();

		ShowroomUtil.run(showroom);
		ShowroomUtil.run(watchShowroom);
		ShowroomUtil.run(mobileShowroom);
	   
		

	}

}
