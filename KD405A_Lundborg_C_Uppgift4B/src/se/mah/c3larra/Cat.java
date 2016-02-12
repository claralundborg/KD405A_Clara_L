package se.mah.c3larra;

public class Cat extends Mammal{
	
	private int numberOfLives;
	private int catInfo;
	
	public Cat (String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.numberOfLives = numberOfLives;
	}
	
	public int getNumberOfLives() {
		return numberOfLives;
	}
	
	public int setNumberOfLives(int i) {
		return this.numberOfLives = i;
		
	}

	@Override
	public String getInfo() {
		
		return "One cat has the latin name " + getLatinName() + ", nurses for " + getGestationTime() + " months, and has " + getNumberOfLives() + " lives." + "\n";

	}

}
