package com.xworkz.sports.boot;

import com.xworkz.sports.app.Area;
import com.xworkz.sports.app.Building;
import com.xworkz.sports.app.Corporator;
import com.xworkz.sports.app.Floor;
import com.xworkz.sports.app.HomeTown;
import com.xworkz.sports.app.Lift;
import com.xworkz.sports.app.Player;
import com.xworkz.sports.app.Sport;

public class SportsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Running main in SportsRunner");
		String name="Cricket";
		
		Floor floor=new Floor("Ground Floor",0);
		Floor floor1=new Floor("First Floor",1);
		Floor floor2=new Floor("Second Floor",2);
		Floor floor3=new Floor("Third Floor",3);
		Floor floor4=new Floor("Four Floor",4);
		Floor floor5=new Floor("Fifth Floor",5);
		Floor floor6=new Floor("Sixth Floor",6);
		
		Floor[] floors= {floor, floor1, floor2, floor3, floor4, floor5, floor6};
		
		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);
		
		Lift[] lifts= {lift, lift1};
		
		Building building=new Building(floors,lifts);
		Building building1=new Building(floors,lifts);
		Building[] buildings= {building};
		
		
		Corporator corporator=new Corporator("Sai",buildings);
		Area area=new Area("BTM Layout", corporator);
		Area area1=new Area("Maleshwaram", corporator);
		Area[] areas= {area,area1};
		HomeTown town=new HomeTown("Bangalore", 543500, areas );
		
		
		
		Player player=new Player("Rohit",25,building,town);
		Player player1=new Player("Hardhik",35,building,town);
		Player[] players= {player,player1};
		
		Sport sport=new Sport(name,players);
	    sport.printInfo();

	}
	

}


