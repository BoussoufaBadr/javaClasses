package com.Class22;

public class Child2 extends Parent{
	
	String hairType="long";
	
	public static void main(String[]args) {
		
		Child2 childObject=new Child2();
		System.out.println("Child 2 eye color "+childObject.eyeColor);
		System.out.println("Child 2 hair color "+childObject.hairColor);
		System.out.println("Child 2 has "+childObject.nose+" nose");
		childObject.sing();
		childObject.playSoccer();
		
	}
	
	public void playSoccer() {
		System.out.println("child 2 can play soccer");
	}

}
