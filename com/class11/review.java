package com.class11;

public class review {

	public static void main(String[] args) {
		//write a program to print a length of each array
		int [][] ar= { { 1,2,3 }, { 4,5,6,9 }, {7,8 } };
		for (int i=0; i<ar.length; i++) {
			System.out.println("The length of row" + (i+1) + " = " + ar[i].length);
			
		}
		
		
		

	

//write a program to print all elements of the 2D array using a for Loop

    
    for (int[] inn : ar ) {
    	for (int elements: inn) {
    		System.out.print(elements);
    	
    }
    	
}




// write a program to find the average of row 2

/*2 6 9 3 7
 * 1 7 9 4 8
 * 0 4 6 2 5
 * 0 1 2 3
 
 */
int [][] rating = {{2, 6, 9, 3, 7},
                  {1, 7, 9, 4, 8,},
                  {0, 4, 6, 2, 5 },
                  {0, 1, 2, 3}};
double sum=0;

for (int i=0; i<rating[1].length; i++ ) {
	sum+=rating[1][i];
	
			
	System.out.print(sum/5);
                  
		
}


//find the number of values above the value of 7
int count=0;
for (int[] inner : rating) {
	for (int element : inner ) {
		if (element>7) {
			count++;
			
		}
	}
}
System.out.println("The number of all elements above 7 is " + count);
	}
}


		
		
		
	
//print the average of values in column 3
int sum=0;
for (int col3=0; col3<rating.length; col3++) {
	sum+= rating[col3][2];
	
}
System.out.println(sum/rating.length);
}
}








