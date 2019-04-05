package com.class15;

public class Greetings1 {
	public static void main (String[]args) {          //any code is only executable when its inside the main method
	//we are creating the objects
		
		Greetings1 obj=new Greetings1();
		obj.askHowAreYou("Omer");
	}
	void askHowAreYou(String name) { //-->you can only use one name once,so for the next one we have to create a different name 
		System.out.println("How are you Amina"+name); //+concatination
		
		
	}

}
