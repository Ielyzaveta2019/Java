package com.class18;

public class Task2 {
	// create a method that will take a String and return whether String is
	// palindrome or not.
	// Method should available to all classes within your projects.

	public static void main(String[] args) {

		Task2 obj = new Task2();
		boolean isPalindrome = obj.isPalidrome("hello");
		System.out.println(isPalindrome);
	}

	protected String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		return reversed;
	}

	public boolean isPalidrome(String str) {
		boolean flag = false;
		String reversed = reverseString(str);
		if (reversed.equalsIgnoreCase(str)) {
			flag = true;
		}

		return flag;
	}
}
