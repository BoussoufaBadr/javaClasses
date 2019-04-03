package com.Class8;

import java.util.Scanner;

public class exercise1Class8 {

	public static void main(String[] args) {
		
		
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



/*
 * Ask user to enter the item they want to buy and the price for the item. Then
 * ask user to pay for it. Every time user enters money accumulate the amount
 * and tell user how much is left to pay off the amount. Whenever user done with
 * payments tell them "Thank you for shopping!"
 */

Scanner scan;
String item;
double change;
double price;
double payment;
double totalPayment = 0;
double balance ;


scan = new Scanner(System.in);
System.out.println("Please enter your item");
item = scan.nextLine();

System.out.println("Please enter the item price");
price = scan.nextDouble();

do {
    System.out.println("Please enter your payment amount");
    payment = scan.nextDouble();

    totalPayment = totalPayment + payment;

    if (totalPayment > price) {
        change = totalPayment - price;
        System.out.println("Please take your change " + change);
        break;
    } else if (totalPayment < price) {
        balance = price - totalPayment;
        System.out.println("Please enter more $" + balance);
    }
} while (totalPayment != price);
System.out.println("Thank you for shopping!");

}
}





