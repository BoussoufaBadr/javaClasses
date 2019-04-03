package com.class10;

public class ReviewClass1 {

	public static void main(String[] args) {
		//           Write a program to Print all elements of 2d array Using Loop
		
		
		int [][] arr= {
                {1,2,3},
                {4,5,6,9},
                {7,6}
                       };
		
		
		

	       for (int i = 0; i < arr.length; ++i) {
	           for (int j = 0; j < arr[i].length; ++j) {
	               System.out.println(arr[i][j]);
	           }
	       }

	       for (int[] innerArray : arr) {
	           for (int data : innerArray) {
	               System.out.println(data);
	           }
	       }
		
		
}
}