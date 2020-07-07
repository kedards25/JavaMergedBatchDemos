package com.learning.genericconstructordemo;

public class GenericConstructorDemo<M> {

	M val;
	
	public GenericConstructorDemo(M paramVal) {
		val=paramVal;
	}
	
	void showVal()
	{
		System.out.println("Generic Val: "+val);
	}
	public static void main(String[] args) {

		GenericConstructorDemo<Character> demo=new GenericConstructorDemo('A');
		demo.showVal();

		GenericConstructorDemo<String> demo2=new GenericConstructorDemo("for Amogh");
		demo2.showVal();
	}

}
