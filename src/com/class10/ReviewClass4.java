package com.class10;

public class ReviewClass4 {

	public static void main(String[] args) {
		
		
		
		
		// print the average of values in column 3

		
		 int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
		
		
		 int sum2 =0;

		 for(int i =0; i<rating.length; i++) {
		     
		     sum2+= rating[i][2];
		     
		 }

		 System.out.println(sum2/rating.length);
		
		
		
		
	}

}
