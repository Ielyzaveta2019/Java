package com.class19;

public class TestAccessModifiers {

		import com.class18.AccessModifiers;

		

			public static void main(String[] args) {
				AccessModifiers obj=new AccessModifiers();
				obj.isPalindrome("Hello"); //accessing public method in different package
				System.out.println(obj.name3);////accessing public variable in different packag
			}
		
