package com.class11;

public class Task2 {

	public static void main(String[] args) {
		//Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan
		String[][] names= {
				{"Mr","Mrs","Ms","Miss"},
				//0,0| 0,1| 0,2| 0,3  
				{"Smith","Jordan","Jackson","Obama"}
				//1,0    |1,1  |  1,2      | 1,3
		};
				System.out.println(names[0][1]+" " + names[1][0]);
				System.out.println(names[0][1]+" " + names[1][3]);
				System.out.println(names[0][2]+" " + names[1][2]);
				System.out.println(names[0][3]+" "+ names[1][3]);
				
				
				String[][] hello=new String[1][3];
				hello[0][0]="Mr";
				hello[0][1]="mrs";
				hello[0][2]="Ms";
				hello[0][3]="Miss";
				//for rows 0, column 0,1,2,3
				
				hello[1][0]="Smith";
				hello[1][1]="Jordan";
				hello[1][2]="Jackson";
				hello[1][3]="Obama";
				// for rows 1, column 0,1,2,3
		}

	}




