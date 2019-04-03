package com.class10;

public class taskClass10 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		String[] array = { "USA", "Russia", "Turkey", "Spain" };
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("USA")) {
                System.out.println("Washington DC");
            } else if (array[i].equals("Russia")) {
                System.out.println("Moscow");
            } else if (array[i].equals("Turkey")) {
                System.out.println("Ankara");
            } else if (array[i].equals("Spain")) {
                System.out.println("Madrid");
            }
        }
        String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
        for (String country : contries) {
            switch (country) {
            case "USA":
                System.out.println("Washington DC");
                break;
            case "Afghanistan":
                System.out.println("Kabul");
                break;
            case "Kazakhstan":
                System.out.println("Astana");
                break;
            case "Ukraine":
                System.out.println("Kiev");
                break;
            }
        }
    }	
		
		
		
		
		
		
		
		
		
		
	}


