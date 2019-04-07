package com.Class12;

public class Main {
	
	
	String carColor,carName; 
	 int carModelYear; 
	  
	  public static void main(String[]args){
	  
	  Main main1=new Main();
	  
	   main1.carColor="Black";
	   main1.carModelYear=2019;
	   main1.carName= "BMW";
System.out.println("car color is " + main1.carColor + " and " + " car model is " + main1.carModelYear + " and " + " car name is " + main1.carName);
	   main1.drive();
	main1.reverse();
    main1.stop();
			
	   //car object
	Main main2=new Main();	

	   main2.carColor="White";
	   main2.carModelYear=2018;
	   main2.carName="Toyota" ;
System.out.println("car color is " + main2.carColor + " and " + " car model is " + main2.carModelYear + " and " + " car name is " + main2.carName);
	
	    main2.drive();
	    main2.reverse();
	    main2.stop();
			
	  }	
	  
	  
	  
	  void drive() {
		System.out.println("Car can drive");	
		}
		void reverse() {
			System.out.println("Car can reverse");	
	}
		void stop() {
			System.out.println("Car can stop");	
	
	  
		
	   
		} 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


