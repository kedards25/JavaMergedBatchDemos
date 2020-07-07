package com.learning.genericsdemo;

public class GenericsDemo <T>{

	T val;
	
	void setValue(T num)
	{
		val=num;
	}
	 
	void showValue()
	{
		System.out.println("Generic value: "+val);
	}
	
	public static void main(String[] args) {
		
		GenericsDemo<Integer> genericsDemo=new GenericsDemo();
		genericsDemo.setValue(5);
		genericsDemo.showValue();
		
		GenericsDemo<Double> genericsDemo2=new GenericsDemo();
		genericsDemo2.setValue(5.6);
		genericsDemo2.showValue();
	}
}
