

public class House{
	
	 private int yearBuilt;
	 private int size;
	 private final int minSize = 10;
	 private final int maxSize = 1000;
	 private final int minYearBuilt = 1800;
	 private final int maxYearBuilt = 2015;
	 
	 public House(int yearBuilt,int size){
	 
		 this.yearBuilt = yearBuilt;
		 this.size = size;
		 
		 if (size < minSize || size > maxSize){
			 System.out.println("The size of the house must be in between 10m2 and 1000m2");
		 }
		 
		 if (yearBuilt < minYearBuilt || yearBuilt > maxYearBuilt){
			 System.out.println("House must be built in between 1800 and 2015");
		 }
	 }
	 
	 public int getYearBuilt(){
		 return this.yearBuilt;
	 }
	 
	 public int getSize(){
		 return this.size;
	 }
	 
	 public final int minSize(){
		 return this.minSize;
	 }
	 
	 public final int maxSize(){
		 return this.maxSize; 
	 }
	 
	 public final int minYearBuilt(){
		 return this.minYearBuilt;
	 }
	 
	 public final int maxYearBuilt(){
		 return this.maxYearBuilt;
	 }
	 
	}
