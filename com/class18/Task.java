package com.class18;
//create a method createEmail()
//based on provided usersName, lastName and emailType
//your method should return compltete email Address
public class Task {
	
 public static void main (String []args) {
	 
	 Task obj = new Task();
	String email = obj.createEmail("John", "Snow", "gmail");
	System.out.println(email);
	
	email=obj.createEmail("Bob", "Snow", "outlook");
	System.out.println(email);
	
 }
 //return type methodName
	String createEmail(String userName, String lastName, String emailType) {
		String email= userName + lastName + "@" +emailType + ".com";
		return email.toLowerCase();
		}
	}


