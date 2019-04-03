package com.Class4;

import java.util.Scanner;

public class LogicalOperatorsEx1 {

	public static void main(String[] args) {
	
		
	
	    boolean rain=true;
	    boolean snow=true;
	    boolean sunny=true;	
	    int temp;
	    
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the temperature");
	    temp=sc.nextInt();
	    
	    
	    if (temp>40 && temp<80) {
	    System.out.println("it s raining");
	    rain=sc.nextBoolean();
	    	
	    	if(rain){
	    	System.out.println("im not going for hiking");
	    	} else  {
		  System.out.println("i will go hiking") ;
		  } 
	    }else if (temp>25 && temp <40) {
	    		System.out.println("it s snowy");	
	            snow=sc.nextBoolean();
	    	
	    	}if(snow) {
	      System.out.println("go for snowboarding");
	    }else {
	    	System.out.println("im not going snowbording");
	    	
	    	 if (temp>80) 
	    		 System.out.println("it s sunny"); 
	 	    	sunny=sc.nextBoolean();
	 	    	
	 	    	if(sunny){
	 	    	System.out.println("im goint to the beach");
	 	    	}else{
	 	    		
	 	    	System.out.println("im not going to the beach");	
	 	    		
	 	    			
	 	    	}
	    }
	    }
	      
	    
}