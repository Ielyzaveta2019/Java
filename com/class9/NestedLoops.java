package com.class9;

public class NestedLoops {
	public static void main (String[]args) {
		 
		 
//		 System.out.println();
//		 for (int i=0; i<=5; i++) {
//			 System.out.println(i);{
//			 
				 
				 /*I want to print pattern
				  * 12345--> 4 rows & 5 columns
				  * 12345
				  * 12345
				  * 12345
				  */
				 
			 for (int i=1; i<5; i++) {
				  for (int y=1; y<6; y++) {
					  System.out.print(y);//12345
				  }
				  System.out.println();
				  
				  /*I want to print a pattern 
				  *1111111--> rows=7, columns =7
				  *2222222
				  *3333333
				  *4444444
				  *5555555
				  *6666666
				  *7777777
				  */
				   for (int i=1; i<=1; i++) {
					    for (int y=1; y<=7; y++) {
					    	System.out.print(i);//1111111 //2222222
					    	 }
					    System.out.println();
					    /*I want to print pattern -->rows=4 cols=5
					     * *****
					     * *****
					     * *****
					     * *****
					     * */
					    
					     for (int a=0; a<4; a++) { 
					    	 for (int b=0; b<5; b++) {
					    		 System.out.print("*");
					    	 }
					    	 System.out.println();
					    	 
					    	 /* I want to print pattern -->4 rows cols=5
					    	  * 54321
					    	  * 54321
					    	  * 54321
					    	  * 54321
					    	  */
					    	 }
					     for (int a=0; a<4; a++) {
					    	 for (int b=0; b<5; b++);
					    	 System.out.print(b);
					    	 }
					     System.out.println();
				   }
					     
					   
					     
					     
				   }
			 }
			 }
		 
	


					  
					  
				  
		 
	


