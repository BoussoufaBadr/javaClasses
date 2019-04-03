package com.class5;

import java.util.Scanner;

public class switchEx1 {

	public static void main(String[] args) {
		
		
		
		
		String country;
		String language;
		Scanner sc;
		
		sc=new Scanner(System.in);
		System.out.println("enter the name of the  country");
		country=sc.nextLine();
		
		switch (country){
		
		case "USA":
			language="English";
			break;
		case "Morocco":
			language="Arabic";
			break;
		case "Pakistan"	:
			language="Urdu";
			break;
		case"England":
			language="English";
			break;
	    default:
	    language= "i dont know";
	    
		}
	   
		System.out.println("the language spoken is " + language);
	}

}
