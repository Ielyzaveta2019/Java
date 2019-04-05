package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
	
		for (int i=0; i<6; i++) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
			
			for (int g=0; g<10; g++) {
				if (g==2 || g==3) {
					continue;
				}
				System.out.println(g);
			}
			System.out.println("I am outside of foor loop");
		}
			
			/* I want to print number from 1 to 20 but skip those that divisible by 3*/
		
		for (int a=1; a<=20; a++) {
			if (a%3==0) {
				continue;
			}
			System.out.println(a);
			
				
				
				}
				
			}
		}

	


