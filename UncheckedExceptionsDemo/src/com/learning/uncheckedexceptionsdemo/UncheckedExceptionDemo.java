package com.learning.uncheckedexceptionsdemo;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		
		//unchecked exceptions are the ones which may occur at runtime and
		//compiler is unaware of
		//and it will not prompt us to handle that error while writing the code
		
		int [] arr= {5,3,7,52,3};
		try
		{
			for (int i = 0; i < 8; i++) 
			{
				System.out.print(arr[i]+"\t");
			}
		}//in case we do not know the exact exception being thrown
		//we can throw an object of parent class of all exceptions ie exception class
		//which wraps all the objects of exception class
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);	
		}

	}

}
