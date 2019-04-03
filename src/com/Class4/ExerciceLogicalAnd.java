package com.Class4;

import java.util.Scanner;

public class ExerciceLogicalAnd {

	public static void main(String[] args) {
	
		
		int height;
		Scanner num= new Scanner(System.in);
		System.out.println("enter your height");
		height=num.nextInt();
		if (height<5) {
			System.out.println("you are short");
		}else if (height==5 && height<6){
			System.out.println("you are meduim");
		}else if(height>6){
			System.out.println("you are tall");
		}else {
			System.out.println(" you height is not valid");
			
		}

	}

}
