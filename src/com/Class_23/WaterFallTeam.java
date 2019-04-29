package com.Class_23;

import com.Class23.Employee1;

public class WaterFallTeam extends Employee1 {

	public static void main(String[] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary1=90000;// can access protected values from different package through inheritance
		//wt.salary;//default values cannot be access in different package
		
		wt.test();//available cause it is protected
		//wt.test1();NOT available cause it is default
	}
}