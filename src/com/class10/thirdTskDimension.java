package com.class10;

public class thirdTskDimension {

	public static void main(String[] args) {
		
		
		
		String[][] country= {
				
				{"Canada","USA","mexico"},
				{"germany","france","spain","portugal"},
				{"Moroco","alger","tuni","libya","moritanya"},
				{"brazil","colomb","argentina","hunduras","venz"}
		};
				for(int i=0;i<country.length;i++) {
				for(int c=0; c<country[i].length;  c++) {
				
				System.out.print(country[i][c]+" ");
				
			}
				System.out.println();
				}	
		
		
	}

}
