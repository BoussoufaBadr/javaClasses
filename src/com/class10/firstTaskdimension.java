package com.class10;

public class firstTaskdimension {

	public static void main(String[] args) {
		
		String[][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{"smith","jordan","jackson","obama"}
				};
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		
		String[][] nam=new String[4][4];
		  nam[0][0]="Mr";
		  nam[0][1]="Mrs";
		  nam[0][2]="Ms";
		  nam[0][3]="Miss";
		  
		  
		  nam[1][0]="smith";
		  nam[1][1]="jordan";
		  nam[1][2]="jackson";
		  nam[1][3]="obama";
		  
		  
		  
		  
		  
		  
		
		String[][] name= {
				{"badr","khadija","yahya","noor"},
				{"A","B","C","D"}
				};
		
		System.out.println(name[0][0]);
		System.out.println(name[0][1]);
		
		
	}

}
