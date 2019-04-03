package com.class5;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		
		Scanner sc;
		char grade;
		String explanation;
		sc=new Scanner(System.in);
		System.out.println("please enter your grade");
		grade=sc.next().charAt(0);
		
		
		switch (grade) {
		
		case 'A':
			explanation="Exellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="average";
			break;
		case 'D' :
			explanation="bad";
			break;
		default:
	         explanation= "not acceptable";
		}
		
		System.out.println("grade is " + explanation);
		
		}

}
