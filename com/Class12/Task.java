package com.Class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*Accept username, password and confirm password and check following requirements:

		*Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
			*Password should be minimum 8 characters, if less → message=”Password is too short”.
			*Password cannot contain username if so, → message=”Password cannot contain username”.
			*Password should match confirmed password, if not  → message “Passwords do not match”.
			/*Only after all requirements met → message “Your username and password have been created”
			 * 
			 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("What is your username");
		String username=scan.nextLine();
		System.out.println("What is your password");
		String password=scan.nextLine();
		System.out.println("Confirm your password");
		String password2=scan.nextLine();
		
		if (!(username.isEmpty() || password.isEmpty())) {
			if (!(password.length()<8)) {
				
			if (!password.contains(username)) {
			if (password2.equals(password))	{
				System.out.println("Your username and password have been created");
				
			}else {
				System.out.println("Passwords do not match");
				
			}
			}else {
				System.out.println("password cannot contain username");
			}
				
			}else {
				System.out.println("password is too short");
				
			}
		 
		}else {
			System.out.println("User name cannot be empty");
			
		}
		
		
		
		
		
		
		
		
			
			
		

	}

}
