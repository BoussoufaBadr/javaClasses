package com.class10;

public class task4 {

	public static void main(String[] args) {
		

		
		
		String[][] grocery= {
				{"banana","apple","orange","pinapple"},
				{"squash","potato","tomatoe"},
				{"milk","cheese","yougurt","butter"}
				};
		
		for(String[] singleGrocery:grocery) {
		for(String shoppings:singleGrocery) {
		
		System.out.print(shoppings+ " ");
		
	}
		System.out.println();
		}	
		
		
		String[][] groc={
				{"banana","apple","orange","pinapple"},
				{"squash","potato","tomatoe"},
				{"milk","cheese","yougurt","butter"}
				};
		for(int i=0;i<groc.length;i++) {
			for(int j=0;j<groc[i].length;j++) {
				System.out.print(groc[i][j] +" ");	
	}

			System.out.println();
}
}
	}
		
		