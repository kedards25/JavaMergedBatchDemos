package com.learning.throwsdemo;

public class ThrowsDemo {

	//throws keyword do not check the condition
	//it states that method may throw an error
	void divide(int a,int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		ThrowsDemo demo=new ThrowsDemo();
		try {
			demo.divide(5, 0);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
