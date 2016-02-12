package se.mah.c3larra;

public class Snake extends Animal{
	
	private boolean poisonus;
	private String snakeInfo;
	
	public Snake (String latinName, boolean poisonus){
		super(latinName);
		this.poisonus = poisonus;
	}
	
	
	public boolean isPoisonus() {
		return poisonus;
	}


	@Override
	public String getInfo() {
		
		if(poisonus) {
			snakeInfo = "poisonus.";
		} else {
			snakeInfo = "not poisonus.";
		}
		
		return "One snake has the latin name " + getLatinName() + " and is " + snakeInfo + "\n";


	}

}
