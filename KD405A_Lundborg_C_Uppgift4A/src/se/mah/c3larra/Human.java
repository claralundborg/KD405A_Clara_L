package se.mah.c3larra;


public class Human {

	private Dog dog;
	private String name;
	private String info;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Dog buyDog(Dog dog1) {
		this.dog = dog1;
		return dog;
	}
	
	public String getInfo(String info) {
		if(dog == null) {
			info = name + " has no dog.";
		} else {
			info = name + " buys " + dog.getName();
		}
		return info;
	}
	
	
	
	
	
	
	
	
	/* public Human(String name) {
		
	this.name = name;
		
		//GAMLA
		 Human.name = name;

			if(name.length() >= Constants.MIN_LETTERS){
				Human.name = name;
			} 
			
			if(name.length() < Constants.MIN_LETTERS){	
				Human.name = "Name must be more than 3 letters! ";
			}
			
			if(name.length() < 1){
				Human.name = "Can't create dog without owner! ";
			}
		}
	
	public static String getName() {
		return name;
	}
	
	public static String buyDog() {
		return dog;
	
	}*/

	/* public String getInfo() {
		
	}*/ 
}
