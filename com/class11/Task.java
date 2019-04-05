package com.class11;

public class Task {

	public static void main(String[] args) {
		// create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array
		//first way (for loop)
		String[] carNames = { "Mercedes", "Toyota", "Honda", "Maserati", "Hyundai", "Nissan"};
		
		 for (int i=0; i<=carNames.length-1; i++) {
		 System.out.println(carNames[i]);
		 }
		 //second way (advanced)
		  for (String car: carNames) {
			  System.out.println(car);
			 
		  }
		  //Create an array of countries. While retrieving all values from an array print capital for each country. Using 2 diffrent loops
		  String[] countryNames = {"USA","Ukraine", "Russia", "Turkey"};
		  
		  for (int i=0; i<countryNames.length; i++) {
			  if (countryNames[i].equals("USA")) {
				  System.out.println("Washington D.C");
			  }else if (countryNames[i].equals("Ukraine")) {
			  System.out.println("Kyiv");
			  }else if (countryNames[i].equals("Russia")) {
				  System.out.println("Moscow");
			  }else if (countryNames[i].equals("Turkey")) {
				  System.out.println("Ankara");
			  }
		  
			  String[] countries= { "USA", "Ukraine", "Russia", "Turkey" };  //4
			  for (String country:countries) {
				  
			  switch ("country names") {
			  case "USA":
			  System.out.println("Washington D.C.");
			  break;
			  case "Ukraine":
			  System.out.println("Kyiv");
			  break;
			  case "Russia":
			 System.out.println("Moscow");
			 break;
			  case "Turkey":
			System.out.println("Ankara");
			break;
			
			
			  }
			  
			  }
			  
		  }
	
	
	}}

		 
		 
		 


