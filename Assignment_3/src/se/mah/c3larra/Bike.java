package se.mah.c3larra;

public class Bike {
	
	private String color;
	private int price;
	private int size;

	
	/** KONSTRUKTORER */
	
	public Bike(String color, int size){
		this.color = color;
		this.size = size;
	}
	
    public Bike(String color, int size, int price){
    	this.color = color;
		this.size = size;
    	this.price = price;
    	
    	/**Boolean som begränsar antalet färger som cyklarna får vara. 
    	Om en färg som inte ingår i de som angetts under Constants anges på en cykel, 
    	kan inte programmet köras. */
    	
    	boolean correctColor = false;
		
		for (int i = 0; i < Constants.bikeColors.length; i ++) {
		if (Constants.bikeColors[i].equalsIgnoreCase(color)){
		   correctColor = true;
		}
		}
		
		 if (!correctColor) {
		throw new IllegalArgumentException("Colors must be black, white or silver"); 
		  }
    	
		/** If-satser som begränsar storlek och pris på cyklarna. Om ett värde utanför de som
		angetts under Constants sätts värdet automatiskt till det minsta eller största värdet. */
		
    	if(size <= Constants.MIN_SIZE){
    		this.size = Constants.MIN_SIZE;
    	}
    	
    	if(size >= Constants.MAX_SIZE){
    		this.size = Constants.MAX_SIZE;
    		}
    	
    	if(price <= Constants.MIN_PRICE){
    		this.price = Constants.MIN_PRICE;
    	} 
    	
    	if(price >= Constants.MAX_PRICE){
    		this.price = Constants.MAX_PRICE;
    	}
    	
//    	for(int i =0; i < Constants.bikeColors.length; i++){
//    		if (0 == color.compareTo(Constants.bikeColors[i].toString())) {
//    			this.color = color;
//    			break;
//    		}
//    		else{
//    			this.color = Constants.bikeColors[0];
//    		}
//    	}
   
    	
	}
    
    /** Metoder */
    
  	public String getColor() {
  		return this.color;
  	}
  	
  	public int getSize() {
  		return this.size;
  	}
  	
  	public int getPrice() {
  		return this.price;
  	}
  	
	
}
	


