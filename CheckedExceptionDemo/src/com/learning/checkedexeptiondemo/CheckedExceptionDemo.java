package com.learning.checkedexeptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		//to handle the runtime error we have to use try..catch block
		//we should put the code which may generate an error in try block
		//and try to execute
		//if there is an error an exception will be raised and the same will be
		//handled by catch block
		
		//checked exceptions are the ones which may occur at runtime and
		//compiler is aware of
		//and it prompts us to handle that error while writing the code
	
		try
		{
			FileReader reader=new FileReader("E:\\java\\kedar\\sample.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: "+e);
		}
	
		

	}

}
