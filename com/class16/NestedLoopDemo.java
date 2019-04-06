package com.class16;

import java.util.Scanner;

public class NestedLoopDemo {
	
	
void printNumber() {
		
		for (int i = 1; i <= 3; i++) {
			for (int y = 1; y <= 3; y++) {
				System.out.println(i + " " + y); // 11; 12;13//21;22;23//31;32;33//41;42;43
			}
		}
	}
	
	public static void main(String[] args) {
		            // name
		
		NestedLoopDemo demo = new NestedLoopDemo();
		
		demo.printNumber();
	    demo.CarMileage();
		demo.NestedLoop();
		demo.Clock();
		demo.Scanner(55,55);
	}


	void CarMileage() {
		for (int a = 0; a <= 9; a++) {

			for (int b = 0; b <= 9; b++) {

				for (int c = 0; c <= 9; c++) {

					for (int d = 0; d <= 9; d++) {

						System.out.println(a + "" + b + "" + c + "" + d);// 0000;0001;0002

					}
				}
			}
		}
	}

	void NestedLoop() {
		for (int i = 0; i < 3; i++) { // i is a counter loop,it shows how many times our inner loop will be executed

			System.out.println("I am outer loop");

			for (int y = 0; y < 3; y++) {
				System.out.println("I am inner loop");

			}

		}
	}

	void Clock() {
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (m < 10) {
					System.out.println(h + ":0" + m);
				} else {
				}
				System.out.println(h + ":" + m);

			}
		}
	}

	void Scanner(int secret, int userNumber) {
		Scanner scan;
		// int secret, userNumber;

		scan = new Scanner(System.in);

		do {
			System.out.println("Please enter any number from 1 to 20");
			userNumber = scan.nextInt();

			if (userNumber < secret) {
				System.out.println("Number is too small, try again");
			} else if (userNumber > secret) {
				System.out.println("Number is to large, try again");
			}
		} while (secret != userNumber);
		System.out.println("Congratulations!! You got it");

	}
}
