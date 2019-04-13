package com.Class21;

public class LocalVariable {

	
		
		public static void main(String[] args) {
			
			String name ="John";
			//System.out.println(name);
			
			LocalVariable obj=new LocalVariable();
			obj.hello(name);//Hello Jack
			System.out.println(name);
			
		}
		public void hello(String name) {
			name="Jack";
			System.out.println("Hello "+name);
		}
	}