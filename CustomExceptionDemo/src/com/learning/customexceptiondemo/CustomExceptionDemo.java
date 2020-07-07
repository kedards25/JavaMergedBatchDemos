package com.learning.customexceptiondemo;

//to create our custom exception,we are creating class called as DivideByZeroException
//and make it inherit the base class i.e. Exception class
class DivideByZeroException extends Exception
{
	//Constructor with call to super class constructor
	public DivideByZeroException(String errMsg) {
		
		//errMsg received as a parameter is passed to parent class constructor
		//so that system default message will be overwritten by our errMsg
		super(errMsg);
	}
}

public class CustomExceptionDemo {

	void divide(int a,int b)
	{
		try
		{
		if(b==0)
		{
			throw new DivideByZeroException("Divider cannot be zero");
		}
		else
		{
			System.out.println(a/b);
		}
		}
		catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		CustomExceptionDemo demo=new CustomExceptionDemo();

			demo.divide(5, 0);

		

	}

}
