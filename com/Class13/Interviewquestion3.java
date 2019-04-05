package com.Class13;

public class Interviewquestion3 {

	public static void main(String[] args) {
		// //3. Find out how many alpha characters present in a string?

		String str="Today is Java";
		//String [] array=str.split("A-Za-z");
        String str2 = str.replaceAll(" ", "");
		System.out.println(str2.length());
	}

}
