package com.learning.genericdemo;

public class GenericDemo<T> {

	// to implement encapsulation
	// declare variable private and generate getter and setters
	// as public access specifier
	private T val;

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	public static void main(String[] args) {
		System.out.println("Accessing variable using int data type");
		// T will be referred to as int data type while accessing
		// methods of val using genDemo
		GenericDemo<Integer> genDemo = new GenericDemo<Integer>();
		genDemo.setVal(10);
		System.out.println(genDemo.getVal());
		
		System.out.println("Accessing variable using float data type");
		// T will be referred to as int data type while accessing
		// methods of val using genDemo
		GenericDemo<Float> genDemo2 = new GenericDemo<Float>();
		genDemo2.setVal(10.5F);
		System.out.println(genDemo2.getVal());
	}

}
