package se.mah.c3larra;

import java.util.ArrayList;

public class BikeStore {
	
	
	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	public static String getAllBikes(){
		
		String returnString = "";
		for (int i = 0; i < allBikes.size(); i++){
			returnString += ("Bike " + (i +1) + " is " + allBikes.get(i).getColor() + " and " + allBikes.get(i).getSize() + " inches big. Price: " + allBikes.get(i).getPrice() + "\n");
		}
		return returnString;
	}
	
	
	public static void addBike(String color, int size, int price){
		
		allBikes.add(new Bike(color, size, price));
	}

	//public BikeStore(String allBikes) {
	//	this.allBikes = allBikes; 
	//}
	
}