package com.class11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find largest number
		 int [] numbers= {10,20,30,40,50,60};
		 int largest=numbers[0];
		 for (int i=0; i<numbers.length; i++) { //or 6
			 if (numbers[i]>largest) {
				 largest=numbers[i];
			 }
		 }
			 System.out.println("The largest number is " + largest);
			 }
	}


