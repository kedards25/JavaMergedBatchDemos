package com.learninng.genericreturntypedemo;

public class GenericReturnTypeDemo<T> {

	T val;

	void setVal(T value) {
		val = value;
	}

	T getVal() {
		return val;
	}

	public static void main(String[] args) {

		// generic type assigned onn left side will automatically be assigned to
		// constructor
		// on right side
		GenericReturnTypeDemo<Double> genericReturnTypeDemo = new GenericReturnTypeDemo();

		genericReturnTypeDemo.setVal(5.7);
		System.out.println(genericReturnTypeDemo.getVal());

		GenericReturnTypeDemo<Integer> genericReturnTypeDemo2 = new GenericReturnTypeDemo();

		genericReturnTypeDemo2.setVal(5);
		System.out.println(genericReturnTypeDemo2.getVal());

	}

}
