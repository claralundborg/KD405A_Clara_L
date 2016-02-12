package se.mah.c3larra;

public abstract class Animal {
	
	private String latinName;
	private String friendlyName;
	
	//Konstructor
	public Animal (String latinName) {
		this.latinName = latinName;
	}
	
	//Metoder
	public abstract String getInfo();
	
	
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	
	public String getFriendlyName() {
		return friendlyName;
	}
	
	public String getLatinName() {
		return latinName;
	}
	

	

}
