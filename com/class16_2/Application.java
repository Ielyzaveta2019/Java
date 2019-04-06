package com.class16_2;

import com.class16.Calculator;

public class Application {

	public static void main(String[] args) {
		ScannerMethod scnMthd = new ScannerMethod();
		
		Calculator operations = new Calculator();
		operations.sum(2,5);
		operations.sub(4,7);
		operations.div(1,8);
		operations.mult(9,4);
	   System.out.println(operations.mult(9, 4));
	   
	   Application app = new Application();
	   System.out.println(app.example6('1'));
		
		
		
	

	}
	void example() {
        System.out.println("No return value and NO Parametrs");
    }
    
    void example2(String name) {
        System.out.println("No return value but with Parameter: "+ name);
    }
    boolean example3() {
    System.out.println("with return value and NO Parametrs");
    return true;
}
    String example4(String name) {
        System.out.println("with return value and Parameter");
        return name;
    }
    boolean example5(String name) {
        System.out.println("with return value and Parameter");
        return false;
    }
    
    char example6(char name) {
        System.out.println("with return value and Parameter");
        //name =1 
        return name;
    }


    }
    


