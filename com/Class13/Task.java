package com.Class13;

public class Task {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. 
		//Write a program to get a new String without any spaces.
		String sentence="Today is Java";
		System.out.println(sentence.replaceAll"^["a-z"]", "");
		
		//Create a String that should be combination of letters,
		//numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String str="123Today is %Java";
		String [] array=str.split("A-Za-z");
		System.out.println(array.length);
		
		
		

	}

}
