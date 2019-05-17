package com.Class36;

public class Tc1 {
	
	/// create an exception: when user it trying to withdraw larger amount that the balance
    //throw an exception saying “You do not have enough money”
	//
	
	public  static int  balance=500;
	
	
	
	
	public static void withdrawMoney(int withdrawAmount) {
		if (withdrawAmount<balance) {
			System.out.println("you can  withdraw");
		}else {  
	 throw new ArithmeticException("u cant  get");
	
		}
		}
	
	public static void main(String[] args) {
		withdrawMoney(200);


}
}