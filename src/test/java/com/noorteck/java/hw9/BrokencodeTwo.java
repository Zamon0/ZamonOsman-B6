package com.noorteck.java.hw9;

public class BrokencodeTwo {
public static void main(String[] args) {
	
	        double tempOne=84.7; //changed to double
			double tempTwo =66; //changed to double
			
			boolean result;
			if (tempOne <= 0 && tempTwo >= 100) {
				result = true;
			}  else if  (tempOne >= 100 && tempTwo >= 0) {
				result = true;
			} else {
				result= false;
			}
			
			System.out.println("results");//added quotation for result
			
			String season = "Spring";// capitalized String changed monday to spring because monday isnt a season

			switch (season) { // removed equal sign
			case "fall": //needed double quote changed the semi colon to a colon
				System.out.println("Recovering from hot weather");
				break;
			case "winter":
				System.out.println("Toooo cold");			
				 
			case "Spring"://changed s to spring
				System.out.println("Recovering from cold weather");			
				break;
			case "summer":
				System.out.println("Toooo hot");			
				 break;//added this missing break
			default: //changed to colon
				System.out.println("Season does not exist!");	
			}
			
			
			for(int i =0; i <=10; i++) { //initialized & declared variable
				if (i == 5) {
					System.out.println("i equals to 5"); //removed capital i
				} else {
					System.out.println("i not equal to 5"); //changed wording because it didnt make sense
				}
			}
			
	}

}
