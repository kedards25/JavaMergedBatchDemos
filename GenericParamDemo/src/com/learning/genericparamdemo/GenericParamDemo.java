package com.learning.genericparamdemo;

public class GenericParamDemo<X,Y> {

	void addValues(X num1,Y num2)
	{
		System.out.println("Val1: "+num1+"\nVal2: "+num2);
	}
	
	
	public static void main(String[] args) {

		GenericParamDemo<Integer,Integer> demo1=new GenericParamDemo();
		demo1.addValues(5, 6);
		
		GenericParamDemo<Integer,Character> demo=new GenericParamDemo();
		demo.addValues(5, 'L');
	}

}
