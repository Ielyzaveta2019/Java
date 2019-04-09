package com.class17;

public class Mainclass {

	public static void main(String[] args) {//static is a modifier
		
			X x =new X(); //x is an local variable
			X y = new X(); //y is local as well
			System.out.println(x.i);
			y.i =200;
			System.out.println(y.i);
			x.methodOfX();
			
		}
}


