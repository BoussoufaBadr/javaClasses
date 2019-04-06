



package com.Class17_2;
import java.util.Scanner;

public class Exercis5Class8 {

	public static void main(String[] args) {
		Exercis5Class8 exe=new Exercis5Class8();
		
		exe.trial2();
	}
		void trial2() {
		Scanner scan;
        int year;
        
        scan=new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            
            System.out.println("Please enter a guessed leap year");
            year=scan.nextInt();
            
           
            if (year%400==0) {
                System.out.println("Year is a leap year");
                break;
            }else if (year%4==0 && year%100!=0) {
                System.out.println("Year is a leap year");
                break;
            }
		
            }
            }
		
	}


