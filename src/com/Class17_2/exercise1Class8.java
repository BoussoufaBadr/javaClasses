package com.Class17_2;

import java.util.Scanner;

public class exercise1Class8 {

	public static void main(String[] args) {
		
		exercise1Class8 Exe=new exercise1Class8();	
		
		Exe.trial3();
		
	}
		void trial3() {
		
	String itemWanted;
	int price;
	int sum=0;
	int amount;
	
	Scanner sc=new Scanner(System.in);
    System.out.println("please enter the name of the item");
	
	itemWanted=sc.nextLine();
	System.out.println("please enter the price");
	price=sc.nextInt();
	
	
	do {
		
		System.out.println("please enter the amount ");
		amount=sc.nextInt();
		sum=sum+amount;
		System.out.println((price-sum)+ " is the amount left to pay off");
	
	}while(sum<price);
	System.out.println("Thank you for shopping");   
	
		
		
	}




}






