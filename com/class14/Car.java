package com.class14;

public class Car {
	//defining the attributes
	
	String make,model, color;
	int door, wheels;
	
	//now we are creating an object
	
	public static void main(String [] args) { //-->method signature
		//ClassName variableName=new ClassName();
		Car car1=new Car();  //-->method body
		//1st object is a car
		
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		//Car Honda has 4 wheels
		System.out.println("Car"+car1.make+" has " +car1.wheels+" wheels");//first specify our object variable which is car1
		//define behavior : actions / behaviors
		car1.drive();
		car1.reverse();
		car1.stop();
		
		
		System.out.println("---------------Second object---------");
		//2nd object 
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4;
		car2.wheels=4;
		//my car is blue Tesla
		System.out.println("My car is "+car2.color+" "+car2.make);
		car2.drive();
		car2.reverse();
		car2.stop();
		
		
	}
		
		
		//first we are creating a method, drive is the keyword (the method has to be inside the class but outside of the main method)
		void drive() {
		System.out.println("Can can drive");
		}void reverse (){
		System.out.println("Car can reverse");
		}void stop (){
		System.out.println("Car can stop");
		
			
		}
}
