package com.Class8;

import java.util.Scanner;

public class taskClass8 {

	public static void main(String[] args) {
	
		
		

		int startNum;
		int endNum;
		int sumEven=0;
		int sumOdd=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter start num");
		startNum=sc.nextInt();
		
		
		System.out.println("enter end num");
		endNum=sc.nextInt();
		if(startNum<endNum) {
	for (int i = startNum; i <= endNum; i++) {
            if(i%2==0)	{
            sumEven=sumEven+i;
            
            }else {
            	sumOdd=sumOdd+i;
            }
            
            }System.out.println("sum of even numers is " + sumEven+ " and the sum of odd numbers is "+ sumEven);
            }
		}}
	
	
   