package com.class11;

public class Recap {

	public static void main(String[] args) {
		
		// lets create an array of names that will hold 5 elements and retrieve all vallues
		// first option create an array using new keyword
		String [] names=new String[7];
		
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[6]="Sandesh";
		//names[5]="Shiva"; will get an runtime exception when trying to access it
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		// second option create an array using array literal
		                         //0         1         2          3      4        5
		 String [] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		 
		 System.out.println("---------Advanced for loop---------");
		 
		 for (int i=0; i<=studentNames.length-1; i++) {
			 System.out.println(studentNames[i]);
		 }
		 //retrieve values using: advanced for loop, for each loop, enhanced for loop
		 
		 for (String student:studentNames) {
			 System.out.println(student);
		 }
		 
		}

}
