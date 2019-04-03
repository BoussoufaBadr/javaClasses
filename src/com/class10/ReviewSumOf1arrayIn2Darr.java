package com.class10;

public class ReviewSumOf1arrayIn2Darr {

	public static void main(String[] args) {
	
		
		int[][] a = {
		           {1,1,2}, 
		           {3,1,2}, 
		           {3,5,3}, 
		           {0,1,2}  
		};
		
		int sum=0;
		
		for (int i=0; i<a[0].length;i++ ) {
			
		
			sum+=a[0][i];
		}
		
		
		System.out.println(sum);
	}

}

		
		
		
		


