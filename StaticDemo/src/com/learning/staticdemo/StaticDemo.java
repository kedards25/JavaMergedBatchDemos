package com.learning.staticdemo;

//static keyword is access modifier
//methods and variables have only one copy per class throughout the 
//execution and hence these are called as class-level resources
public class StaticDemo {

	static int val=5;
	int num=8;
	
	//non-static methods can access both, static and non-static variables
	void showVal()
	{
		num++;
		val++;
		System.out.println(val+" "+num);
	}
	
	static void dispVal()
	{
		//non-static members cannnot be accessed from static methods
		//num++;==>error
		val++;
		System.out.println(val);
	}
	public static void main(String[] args) {
		
		//Static members exist even before execution of class i.e.
		//even before creation of object
		StaticDemo staticDemo=new StaticDemo();
		StaticDemo staticDemo1=new StaticDemo();
		
		//if we do not use keyword static 
		//both the objects will maintain their own copy of variable val
		//and perform the operation
		staticDemo.showVal();	//w/o static=>6 	w static=>6

		//it will not refer to copy maintained by staticDemo obj
		//and hence variable will be re-initialized as a copy of staticDemo1
		staticDemo1.showVal();	//w/o static=>6 	w static=>7
		
		staticDemo.showVal();	//w/o static=>7		w static=>8
		
		//as method is declared as static it is a class-level resource 
		//and hence can be accessed without object of the class
		//hence it will not maintain different copy
		dispVal();
		//className.methodName
		StaticDemo.dispVal();
		dispVal();
	}

}
