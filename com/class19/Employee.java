package com.class19;

public class Employee {
	/*Create three  variables  eID , salary and set the CEO to “Sumair"
	 * Create two objects of the class Employee
	 * 	Set the value of eID, salary for each of the objects
	 * 	Print out the eID , salary and  CEO for each of the objects
	 */

int eId;
int salary;
public static String CEO="Sumair";

public static void main (String[]args) {
	
	Employee first = new Employee();
	Employee second = new Employee();
	
	first.eId=1234567;
	first.salary=50000;
	
	second.eId=2345678;
	second.salary=30000;
	
	first.play();
	second.play();
	}
void play() {
	System.out.println(CEO+" "+eId+" "+salary);
}
}
