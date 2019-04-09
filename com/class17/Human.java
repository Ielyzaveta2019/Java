package com.class17;

public class Human {
static String eyeColor="Brown";// these are instance variables (height,weight....)-->also properties
      int height=6;
int weight=180;
String gender="F";

String programingLanguage = "Java";

void speak() {
	String language = "English";
	
	System.out.println("Humans can speak " + language);//language wont be visible outside the method,meaning in the next line, those are called local
}
void coding() {
	System.out.println("Syntax students can code");
}
void print () {
	System.out.println(eyeColor);
}
public static void main(String[]args) {
	Human person = new Human();
	person.eyeColor= "pink";
	
	
	
System.out.println(person.eyeColor);
System.out.println(person.height);
System.out.println(person.weight);
System.out.println(person.gender);

}
}
