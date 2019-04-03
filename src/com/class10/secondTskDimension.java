package com.class10;

public class secondTskDimension {

	public static void main(String[] args) {
		
		
		String[][] cars={
                {"ford", "chev", "suburban"},
                {"mercedez","audi","volsvagen"},
                {"fiat","dacia","renault","lincon"},
                {"mitsu","honda","toyota","camry"}
		};
        
		
		for(int i=0;i<cars.length;i++) {
			for(int b=0;b<cars[i].length;b++) {
			System.out.print(cars[i][b]+" ");	
			}
		
		System.out.println();
			}

            }
            }  