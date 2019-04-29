package com.Class29;

public interface Shape {
	
	
	void calculateArea();  
	void calculatePerimiter(); 
	
}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        int CircleArea;
        int r=5;
        CircleArea=(int) (3.14*(r*r));
        
        System.out.println("Calculating area of circle "+CircleArea);
        
    }
    @Override
    public void calculatePerimiter() {
        int Perimeter;
        int r=5;
        Perimeter=(int) (2*3.14*5);
        System.out.println("calculating perimeter of circle "+Perimeter);
        
    }
    
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        int SquareArea;
        int a=5;
        SquareArea=a*a;
        System.out.println("Calculating area of square "+SquareArea);
        
    }
    @Override
    public void calculatePerimiter() {
        int Perimeter;
        int a=5;
        Perimeter=4*a;
        System.out.println("Calculating perimeter of square "+Perimeter);
        
    }
    
}


/// DIFFERENT WAY 
 interface Shape1 {

	void calculateArea(double num);
	void calculatePerimiter(double num);
}
class Circle1 implements Shape1 {

	@Override
	public void calculateArea(double num) {
		double area= 3.14*(num*num);
		System.out.println(area);
	}
	@Override
	public void calculatePerimiter(double num) {
		double perimiter=2*(num*3.14);
		System.out.println(perimiter);
	}
	
	public void whoAmI() {
		System.out.println("I am a circle");
	}
}

class Square1 implements Shape1{

	@Override
	public void calculateArea(double num) {
		double area=num*num;
		System.out.println(area);
	}
	@Override
	public void calculatePerimiter(double num) {
		double perimiter =4*num;
		System.out.println(perimiter);
	}
}



