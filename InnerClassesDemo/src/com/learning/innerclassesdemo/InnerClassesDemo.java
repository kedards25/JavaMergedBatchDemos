package com.learning.innerclassesdemo;

public class InnerClassesDemo {

	private int val=7;
	
	//child class being member of parent class 
	//can access private members of parent class too.
	class InnerClass
	{
		void showVal()
		{
			System.out.println("Value from outer class is: "+val);
		}
	}
	//child class being member of parent class 
	//parent class can also access members of child class
	//we are creating object of child class in the body of parent class

	InnerClass innerClass=new InnerClass();
	
	//invoking method from child class through object
	//in method from parent class
	void invokeMethod()
	{
		innerClass.showVal();
	}
	
	public static void main(String[] args) {
		
		//We shall create object of parent class
		//so that we can have access to child and parent members
		InnerClassesDemo demo=new InnerClassesDemo();
		demo.invokeMethod();

	}

}
