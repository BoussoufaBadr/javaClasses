package com.Class8;

public class Pattern {

	public static void main(String[] args) {
		

//          System.out.print(i);
//      }

      /*I want to print pattern
       * 123456789 -->rows =5, columns=9
       * 123456789
       * 123456789
       * 123456789
       * 123456789
       */
      
      for (int a=1; a<=5; a++) {
          
          for (int b=1; b<=9; b++) {
              
              System.out.print(b);//12345
          }
          System.out.println();
      }
      
      /*I want to print pattern
       * 1111111 --> rows=7, columns=7
       * 2222222
       * 3333333
       * 4444444
       * 5555555
       * 6666666
       * 7777777
       */
      
      for (int i=1; i<=7; i++) {
          
          for (int y=1; y<=7; y++) {
              System.out.print(i);//1111111 //2222222
          }
          System.out.println();
      }
 

		
		
		
/*I want to printout
 * *****    rows=4; cols=5;
 * *****
 * *****
 * *****
 */
for (int a=0; a<4; a++) {
    for (int b=0; b<5; b++) {
    	
        System.out.print("*");
    }
    System.out.println();
}
	  
	}
	}	  
	  
	 
	  
	  
	  
	


