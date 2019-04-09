package com.class17;

public class Application1 {
	//Create another class called Application
	//from this application class create 3 different instances/objects of it and print the properties and functions/methods
	
	public static void main (String[]args) {
		Animals dog = new Animals(); //object one
		
	    System.out.println("This is dog");		
	    System.out.println(dog.age);
		System.out.println(dog.weight);
		System.out.println(dog.breed);
		dog.name="weqas";//if there is no static we create an object
		System.out.println(Animals.name);
		
		Animals dog1 = new Animals(); //object two
		
		System.out.println("This is dog1");
		
     	System.out.println(dog1.age);
     	System.out.println(dog1.weight);
	    System.out.println(dog1.breed);
		System.out.println(dog1.name);
		
		Animals dog2 = new Animals();
		
		System.out.println("This is dog2");
		
		System.out.println(dog2.age);
     	System.out.println(dog2.weight);
	    System.out.println(dog2.breed);
		System.out.println(dog2.name);
		
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Printing the minimum value");
		System.out.println (Minimum.minOfValues(my_array));
		
		 int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };// --> related to maximum class
		System.out.println(Maximum.methodfindMax(array));
		
		
		System.out.println(Maximum.methodfindMinimum(array));	
		
		
		

		
	}

}
