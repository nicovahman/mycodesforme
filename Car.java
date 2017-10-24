package Opgave_20;

public class Car {
	
	private String Mærke;
	private String nummerplade;
	private String Farve;
	
	//Konstruktør
	 public Car (String mærke, String nummerplade, String farve) {
		this.Mærke	= mærke; 
		this.nummerplade = nummerplade;
		this.Farve = farve; 
		
	 }
	 
	public String toString() {
		
		String bil;
		 bil = ("["+nummerplade+"] " + " " + Farve  + " " + Mærke) ;
		 return bil;
	}
	
	public boolean equals(Car a) {
		if (a.nummerplade == this.nummerplade) {
			 return true; }
		
			 else {
				 return false;
			 } 
	}
		
		public boolean alike(Car a) {
			if (a.Mærke == this.Mærke && a.Farve == this.Farve) {
				 return true; }
			
				 else {
					 return false;
					 
		}
		
		
}
	
	}
	
