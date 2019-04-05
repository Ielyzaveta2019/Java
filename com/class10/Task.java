package com.class10;

public class Task {
	//Create an array of chars and store grades into it: A,B,C,D,E,F. 
	//Then print a grade B (use 2 different ways of creating an array).
	
	public static void main (String[]args) {
		char [] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println (grades[1]);
	
		
		
		//String[] names= {"Liza", "Douglas", "Valeria", "Ryan"};
		//System.out.println (names[0]);
		
		
		String[]names= new String [4];
		names[0]="Liza";
		names[1]="Douglas";
		names[2]="Valeria";
		names[3]="Ryan";
		System.out.println(names[0]);

}
}