package com.class17;

public class Minimum {

		//Create a class Called Minimum with in it create a method called minOfValues

         //make it static

         //From your previous Applications class call the method and pass an array argument and print out the result
	
        static int minOfValues(int[] x ){
        
        int min = x[0];
        
        for(int y: x) {
            
            if(y<min) {
                min = y;
            }
        }
        
        return min;
        }

		}


