package com.Class13;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String without using a reverse function
		//1 method using toCharArray();
		
		String original="Today is Java Class";
		String reverse="";
		
		char [] array=original.toCharArray();
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];//"+"s"
			
		}
		System.out.println("Reversed String is: "+reverse);
		
		//2nd method CharAt
		String reverse1="";
		
		for (int i=original.length()-1; i>=0; i--) {
			reverse1=reverse1+original.charAt(i);		
			}
		System.out.println("Reversed String is:"+reverse1);
		
		//3rd method using substring()
		
		String reverse2="";
		for (int i=original.length(); i>0; i--) {
			reverse2=reverse2+=original.substring(i-1, i);
		}
		System.out.println("Revesred String is:"+reverse2);
		

	}

}
