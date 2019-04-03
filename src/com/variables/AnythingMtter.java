package variables;

import java.util.Scanner;

public class AnythingMtter {

	public static void main(String[] args) {
		
		Scanner objectvalue= new Scanner(System.in);
		
	
		  System.out.println("please enter the length");
		  int value1=objectvalue.nextInt();
		  
		  System.out.println("please enter the width");
		  int value2=objectvalue.nextInt();
		  
		  if (value1==value2) {
			  System.out.println("the object is square");
		  }else {
			  System.out.println("the object is rectangle");  
		  }
		 
	}
	
	
	
		
		

	}


