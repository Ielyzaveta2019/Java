package com.class7;

public class Loops {

	public static void main(String[] args) {
		
		//to eleminate repetition we use loops
		
		System.out.println("good morning");
			
		
		
	/*Loops in Java:
	1.while
	2.do while
	3. for 
	enhanced for loop (for each loop)//collections or errays 
	
	*/
	boolean morning=true;
	
	//while (morning) {
		//System.out.println("Good morning");//infinite times
		
		morning = false;
	
	
		int a=1;
		while (a<10) {
		System.out.println("Good morning");
		a++;
		
		}
		
		int b=1;
		
		while (b<=5) {
			System.out.println("I am insisde while loop"+b);
			b++;
		}
		System.out.println("I am outside of while the loop");
		
		//I want to print values from 1 to 20 inclusive but all in 1 line with space;
		
		int q=1;
		while(q<=20) {
			System.out.print(q+" ");
			q++;
		}
		
		
		//I want to print values from 10 to 1;
		int e=10;
		while(e>=1) {
			System.out.println(e);
			e--;
		}
		}
	
		 
				
		
		
		
	}


