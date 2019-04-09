package com.class17;

public class Application {

	public static void main(String[] args) {
		
		Human person1 = new Human();//person is an object-> this is the object of Human class(see in this package)
		person1.print();
		person1.eyeColor= "pink";
		
		person1.print();
		
    System.out.println(person1.eyeColor);
    System.out.println(person1.height);
    System.out.println(person1.weight);
    System.out.println(person1.gender);
    
    Human person2 = new Human();
    person2.print();
    person2.eyeColor= "orange";
    
    person2.print();
    
    System.out.println(person2.eyeColor);
    System.out.println(person2.height);
    System.out.println(person2.weight);
    System.out.println(person2.gender);
    
    
	}

}
