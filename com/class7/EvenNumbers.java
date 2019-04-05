package com.class7;

public class EvenNumbers {
	public static void main(String[] args) {
		/* print only even numbers from 10 to 100 */

		/*
		 * int num = 1;
		 * 
		 * while (num <= 100) { System.out.println("I am inside while loop");
		 * 
		 * if (num % 2 == 0) { System.out.println(num); num++; } }
		 */
		

		/*
		 * create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 as long as it is workDay print-->"I need a day off" and
		 * increment day day once day is 6 -->your condition for your loop should become
		 * false
		 */

		boolean workDay = true;
		int day = 1;

		while (workDay) {

			System.out.println(" I need a day off ");

			day++;
			if (day > 5) {
				workDay = false;
				
			}
		}
	}

}
