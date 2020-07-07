package com.learning.throwdemo;

public class ThrowDemo {

	//called function may throw an exception at runtime to calling function
	//using throw keyword
	
	//called function
	void divide(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("Second number cannot be zero");
		}
		else
		{
			System.out.println(a/b);
		}
	}
	
	public static void main(String[] args) {
		
		ThrowDemo demo=new ThrowDemo();
		
		try 
		{
			demo.divide(5, 0);//calling function
		} 
		catch (Exception e) 
		{
			System.out.println("Error: "+e);
		}
		

	}

}
