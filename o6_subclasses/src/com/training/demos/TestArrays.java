package com.training.demos;

public class TestArrays {

	public static void main(String[] args) {
	
	
		
		// Initialize array1
		int[] array1 = {2,3,5,7,11,13,17,19 };
		
		int[] array2;
		
		System.out.print(" array1 is : ");
		printArray ( array1 );
		
		
		array2  = array1;
		array2[0] = 0;
		array2[2] = 2;
		array2[4] = 4;
		array2[6] = 6;
		
		
		System.out.print(" array1 is : ");
		printArray ( array1 );
		
		
		
	}

	private static void printArray(int[] array) {
		for ( int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
