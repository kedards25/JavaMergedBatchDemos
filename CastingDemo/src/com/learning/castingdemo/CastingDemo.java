package com.learning.castingdemo;

public class CastingDemo {
	
	public static void main(String[] args) {
		
//		TypeCastingDemo demo=new TypeCastingDemo();
//		demo.dispVal();
		
		//Though we are creating object of the parent class,
		//the object is getting initialized with child class 
		//hence object will refer to child context
//		DemoP demoP=new DemoC();	//upward casting
//		demoP.greet();
		
		//Downcasting is allowed at compile time but will throw an error at run time
		DemoP demoP1=new DemoP();
		DemoC demoC=(DemoC)demoP1;	//downward casting
		demoC.greet();
	}

}
