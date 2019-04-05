package com.Class13;

public class Interviewquestions4 {

	public static void main(String[] args) {
		// 4.How to find out the part of the string from a string? What is substring? Find number of words in string?
		String str1="Today is Saturday";
		String st = str1.substring(0, 5);
		System.out.println(st);
		
		String str3[] = str1.split(" ");
		System.out.println(str3.length);
		System.out.println();
	}

}
