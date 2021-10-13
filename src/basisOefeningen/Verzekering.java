package basisOefeningen;

import opdracht.utils.InleesUtil;

public class Verzekering {

	public static void main(String[] args) {
		int leeftijd = InleesUtil.readInt("Geef je leeftijd"); //via console hieronder opgeven en enter
		int waarde = 40000;
		String voertuig = "scooter";

		//voer met if, else, else if statements de volgende checks uit in de opgegeven volgorde, op de opgegeven leeftijd en waarde en voertuig
		
		//Check 1:als de opgegeven leeftijd hoger is dan 90 wordt de volgende melding geprint:
		//Helaas je bent te oud
		//Check 2: (alleen uitvoeren als check 1 niet waar is) als de opgegeven leeftijd groter of gelijk is aan 18 wordt de volgende melding geprint:
		//Oke, je mag een verzekering en:
		//Check 3: (alleen uitvoeren als check 2 waar is) na bovenstaande melding moet gecheckt worden of de leeftijd lager is dan 30 EN of de waarde groter is dan 40000,
		//als de waar is wordt de volgende melding geprint:
		//extra premie vanwege dure auto + < 30
		//is check 3 niet waar dan wordt de volgende melding geprint:
		//Normaal tarief vanwege waarde en/of leeftijd
		//Check 4: (extra check, uitvoeren als check 2 waar is) check dan of de leeftijd groter of gelijk is aan 18 EN of de leeftijd kleiner of gelijk is aan 24,
		//als dat waar is wordt de volgende melding geprint:
		//Nog een keer verhoging vanwege jonge leeftijd
		//Check 5: (alleen uitvoeren als check 1 en 2 niet waar zijn) als de leeftijd groter of gelijk is aan 16 EN het voertuig is een scooter OF het voertuig is een elektrische fiets EN het voertuig is geen auto, dan wordt de volgende melding geprint:
		//je mag een scooter of elektrische fiets verzekeren
		//Check 6: (alleen uitvoeren als check 5 niet waar is) is dit niet waar dan wordt de volgende melding geprint:
		//je mag helaas geen verzekering afsluiten
		
		//draai de applicatie meerdere keren, zorg dat je alle meldingen een keer ziet
		
//		if (leeftijd > vul in) {
//			System.out.println("Helaas je bent te oud");		
//		} else if (vul in >= vul in) {
//			System.out.println("Oke, je mag een verzekering en:");		
//			if (vul in < vul in && vul in > vul in) {
//				System.out.println("extra premie vanwege dure auto + < 30");	    
//			} else {
//				System.out.println("Normaal tarief vanwege waarde en/of leeftijd");
//			}			
//			if (vul in >= vul in && vul in <= vul in) {
//				System.out.println("Nog een keer verhoging vanwege jonge leeftijd");
//			}
//		
//		} else if (vul in >= vul in && vul in == "scooter" || vul in == "elektrische fiets" && vul in != "auto") {
//			System.out.println("je mag een scooter of elektrische fiets verzekeren");		
//		} else {
//			System.out.println("je mag helaas geen verzekering afsluiten");
//		}


	}

}
