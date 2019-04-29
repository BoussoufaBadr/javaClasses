package com.Class29;

public abstract class Marks {
	abstract double getPercentage(); 
		
}

class A extends Marks{
	double a;
	double b;
	double c;
 A(double a, double b, double c) {
	this.a=a;
    this.b=b;
	this.c=c;
	}

@Override
double getPercentage() {
	
	double average=(a+b+c)/3;
	System.out.println(average);
	return average;
	
}	
}

class B extends Marks{
	double a;
	double b;
	double c;
	double d;
  B(double a, double b,double c,double d ) {
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	}

@Override
double getPercentage() {
	double average=(a+b+c+d)/4;
	System.out.println(average);
	return average;
	
}

}