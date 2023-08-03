package com.xworkz.casting.zoo.boot;

import com.xworkz.casting.zoo.app.NationalZoo;
import com.xworkz.casting.zoo.app.StateZoo;
import com.xworkz.casting.zoo.app.Zoo;
import com.xworkz.casting.zoo.app.ZooUtil;

public class ZooRunner {

	public static void main(String[] args) {

		
		System.out.println("Running main in ZooRunner");
		
		Zoo zoo=new Zoo();
		NationalZoo nationalZoo=new NationalZoo();
		StateZoo stateZoo=new StateZoo();
		
		ZooUtil.run(stateZoo);
		ZooUtil.run(nationalZoo);
		
	}

}
