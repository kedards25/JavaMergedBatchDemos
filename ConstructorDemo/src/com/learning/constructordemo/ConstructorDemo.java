package com.learning.constructordemo;

/*
 * Constructor
	*Constructor is a special method used to initialize member variables at runtime(dynamically)
	*Constructor has name same as that of class name
	*Constructor need not to be invoked explicitly but
	are invoked automatically as soon as object of the class is created
	*Constructor cannot have any logic within
	*hence constructor cannot return a value
	*Constructor can have access specifier
	*Constructor cannot be inherited
 * */
public class ConstructorDemo {
	
	int num;
	//no-arg constructor
	//constructor without parameters
	ConstructorDemo()
	{
		System.out.println("Hello from constructor");
	}
	
	//parameterized constructor
	ConstructorDemo(int val)
	{
		num=val;
		System.out.println("Hello from parameterized constructor "+num);
	}
	
	public static void main(String[] args) {
		//Constructor gets invoked as soon as object of the class is created
		//as object gets initialized with new <ConstructorName>()
		//if no constructor is defined in the class then call to default constructor
		//is given by the compiler
		ConstructorDemo constructorDemo=new ConstructorDemo();
		ConstructorDemo constructorDemo1=new ConstructorDemo(25);
		
	}

}
