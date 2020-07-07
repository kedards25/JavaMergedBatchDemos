package com.learning.inheritancedemo;

interface DemoP
{
	int NUM=9;
}

abstract class DemoP2
{
	abstract void showVal();
}

//This sequence has to be same while inheriting
//we cannot make a class implement an interface first and then a class
//trick to remember the sequence :alphabetic order of keywords
public class InheritancDemo extends DemoP2 implements DemoP {

	@Override
	void showVal()
	{
		System.out.println("Value from interface: "+NUM);
	}
	
	public static void main(String[] args) {
		
		InheritancDemo demo=new InheritancDemo();
		demo.showVal();

	}

}
