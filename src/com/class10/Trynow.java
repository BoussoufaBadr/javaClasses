package com.class10;

public class Trynow {

	public static void main(String[] args) {
		
		// Write a program to print the length of each array.
		int[][] a = {
		           {1,1,2}, 
		           {3,1,2}, 
		           {3,5,3}, 
		           {0,1,2,4}  
		};
		
		for (int[] bucky:a){
		
			
			System.out.println(bucky.length);
		}
		
		
		
		// Write a program to Print all elements of 2d array Using Loop
		
		
		int[][] ar = {
		           {1,1,2}, 
		           {3,1,2}, 
		           {3,5,3}, 
		           {0,1,2,4}  
		};
		
		for(int i=0 ; i<ar.length;i++) {
			
		for(int b=0; b<ar[i].length ;b++)	{
			System.out.print(ar[i][b]+" ");	
		}
		System.out.println();	
		}
		
		
		
		
		
	}

}
