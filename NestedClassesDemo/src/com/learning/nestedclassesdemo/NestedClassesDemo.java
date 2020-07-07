package com.learning.nestedclassesdemo;

public class NestedClassesDemo {

	static int num=8;
	
	static class NestedClass
	{
		static void disp()
		{
			System.out.println("Static value from parent class: "+num);
		}
	}
	//As the class and method is declared as static
	//we can access it without object or by referring by className 
	static void callMethod()
	{
		NestedClass.disp();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClassesDemo.callMethod();
	}

}
