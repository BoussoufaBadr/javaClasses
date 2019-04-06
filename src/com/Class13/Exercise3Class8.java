package com.Class13;

public class Exercise3Class8 {

	public static void main(String[] args) {
		

		for (int a=1;a<=5;a++) {
			
			for(int b=1;b<=a;b++) {
			
			System.out.print("*");
		}
			System.out.println();
	}
		
	    for (int a=1;a<=4;a++)	{
	    	
	        for(int c=4;c>=a;c--)
	        	
	        	System.out.print("*");
		}
	           System.out.println();
	   

		

/*
 * Print the following pattern: 1 12 123 1234 12345
 */

for (int i = 1; i <= 5; i++) {
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}

 for (int i=1; i<=4; i++) {
    for (int y=4; y>=i; y--) {
        System.out.print("*");
    }
    System.out.println();
}

}
}





