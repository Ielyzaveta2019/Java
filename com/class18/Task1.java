package com.class18;

public class Task1 {
	
public static void main (String[]args) {
	//we are using access modifiers
	Task1 obj = new Task1();
	String reversed = obj.reverseString("Hello");
	System.out.println(reversed);
}
  /* create a method that will take 1 parameter as a String and return reversed String
  * Method should be visibly only within same package
  */

protected String reverseString (String str) {
	String reversed = "";
	for (int i =str.length()-1; i>=0; i--) {
		reversed = reversed+str.charAt(i);
	}
	return reversed;
	}
}

