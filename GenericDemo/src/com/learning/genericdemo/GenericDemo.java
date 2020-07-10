package com.learning.genericdemo;

public class GenericDemo<T> {	//in Diamond operator we are mentioning that
								//we are going to use T as dynamic data type

	// to implement encapsulation
	// declare variable private and generate getter and setters
	// with public access specifier
	private T val;	//T is treated as data type

	public T getVal() {	//T is treated as return type
		return val;
	}

	public void setVal(T val) {	//T is treated as data type of the parameter
		this.val = val;
	}

	public static void main(String[] args) {
		System.out.println("Accessing variable using int data type");
		// T will be referred to as int data type while accessing
		// methods of val using genDemo
		//After Java 7 we need not to mention the generic type on right hand side of 
		//object creation,it gets assigned automatically from left side
		//GenericDemo<Integer> genDemo = new GenericDemo<Integer>();
		//GenericDemo<Integer> genDemo = new GenericDemo<>();
		GenericDemo<Integer> genDemo = new GenericDemo();
		genDemo.setVal(10);
		System.out.println(genDemo.getVal());
		
		System.out.println("Accessing variable using float data type");
		// T will be referred to as float data type while accessing
		// methods of val using genDemo2
		GenericDemo<Float> genDemo2 = new GenericDemo<Float>();
		genDemo2.setVal(10.5F);
		System.out.println(genDemo2.getVal());
	}

}
