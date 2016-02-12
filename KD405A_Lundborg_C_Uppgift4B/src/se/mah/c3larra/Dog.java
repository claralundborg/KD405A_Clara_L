package se.mah.c3larra;

public class Dog extends Mammal{

	private boolean stupid;
	private String dogInfo;
	
	public Dog (String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}
	
	public Dog (String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
	}
	
	public boolean isStupid () {
		return stupid;
	}

	@Override
	public String getInfo() {
		
		if (stupid) {
			dogInfo = "stupid.";
		} else {
			dogInfo = "not stupid";
		}
		
		return "One dog has the latin name " + getLatinName() + ", nurses for " + getGestationTime() + " months, and is " + dogInfo + "\n";

		
	}
	
	
}
