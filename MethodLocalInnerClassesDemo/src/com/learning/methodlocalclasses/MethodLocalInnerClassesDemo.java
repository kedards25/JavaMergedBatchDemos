package com.learning.methodlocalclasses;

public class MethodLocalInnerClassesDemo {

	private int val=78;
	
	//Method local classes are the ones 
	//which are declared within method body of parent class
	void showVal()
	{
		class MethodLocalClass
		{
			void dispVal()
			{
				System.out.println("Value invoked in method local inner class: "+val);
			}
		}
		//creating object of MethodLocalClass to access method 
		MethodLocalClass localClass=new MethodLocalClass();
		localClass.dispVal();
	}
	
	public static void main(String[] args) {
		
		MethodLocalInnerClassesDemo demo=new MethodLocalInnerClassesDemo();
		demo.showVal();

	}

}
