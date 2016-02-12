package se.mah.c3larra;

import java.util.ArrayList;

public class TestBike {
	
	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	
	public static void main(String[] args) {
		
		
		/** LISTA MED CYKLAR */
			
		Bike bike1 = new Bike("black", 10, 1000);
		allBikes.add(bike1);
		Bike bike2 = new Bike("white", 12, 2000);
		allBikes.add(bike2);
		Bike bike3 = new Bike("white", 14, 4000);
		allBikes.add(bike3);
		Bike bike4 = new Bike("black", 16, 6000);
		allBikes.add(bike4);
		Bike bike5 = new Bike("silver", 18, 8000);
		allBikes.add(bike5);
		Bike bike6 = new Bike("black", 20, 20000);
		allBikes.add(bike6);
		Bike bike7 = new Bike("silver", 22, 22000);
		allBikes.add(bike7);
		Bike bike8 = new Bike("white", 24, 24000);
		allBikes.add(bike8);
		Bike bike9 = new Bike("black", 26, 26000);
		allBikes.add(bike9);
		Bike bike10 = new Bike("black", 30, 32000);
		allBikes.add(bike10);
		
		/** Skriver ut cyklarna från listan i consolen */
		
		int i = 1;
		for (Bike bikes : allBikes) {
			System.out.println("Bike " + (i++) + " is " + bikes.getColor() + " and " + bikes.getSize() + " inches big. Price: " + bikes.getPrice());
		}
		
	}
}
