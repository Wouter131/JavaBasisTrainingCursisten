package sandboxBasisOefeningen;

import java.util.ArrayList;

public class Auto {
	  String type;
	  int motorVermogen;
	  double afstand;
	  int versnelling = 0;
	  
	  //Overloaded constructors: dezelfde constructor naam, maar met verschillende argumenten
	  
	  public Auto() {
		  System.out.println("Groeten van de no-argument constructor");
	  }

	  public Auto(String t) {
		  this();
		  System.out.println("Groeten uit de 1 argument constructor");
	      this.type = t;
	      this.afstand = 13.13;
	      this.motorVermogen = 40;
	  }
	  
	  public Auto(String s, double d ) {
		  this(s);
//		  System.out.println("Groeten uit de 2 argument constructor");		  
	      this.afstand = d;
	      this.motorVermogen = 40;		  
	  } 
	  
	  public Auto(String s, double d, int i ) {
		  this(s, d);
//		  System.out.println("Groeten uit de 2 argument constructor");	 
	     
	      this.motorVermogen = i;		  
	  }
	  



	public static void main(String[] args) {
		Auto a = new Auto("Ferrari", 14.23, 44);
		Auto b = new Auto("Mercedes", 17.88, 34);	
		
		Auto toetToet[] = new Auto[300];
		toetToet[0] = a;
		
		System.out.println(toetToet.length);
		
		Auto toetToet2[] = toetToet.clone();
		
		
		ArrayList<String> testers = new ArrayList<>();
		
		testers.add("Wouter"); //index 0 = Wouter
		testers.add("Sander"); //index 0 = Wouter index 1 = Sander		
		testers.add(1, "Martijn"); //index 0 = Wouter index 1 = Martijn index 2 = Sander
		System.out.println(testers.size()); //3
		System.out.println(testers.get(2)); //Sander
		testers.set(0,  "Marcel"); //index 0 = Marcel index 1 = Martijn index 2 = Sander
		System.out.println(testers.get(0)); //Marcel
		System.out.println(testers.get(1)); //Martijn		
		testers.remove(1); //index 0 = Marcel index 1 = Sander
		System.out.println(testers.get(1)); //Sander
		System.out.println(testers.indexOf("Sander")); //1
		
		
		
		
		
		
		
		
	  
        
        


	
		
		
		
		
		

	}

}
