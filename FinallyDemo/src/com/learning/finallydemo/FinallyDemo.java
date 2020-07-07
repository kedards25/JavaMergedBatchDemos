package com.learning.finallydemo;

public class FinallyDemo {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 3, 7 };

		// Try block can have more than one catch blocks as well
		// to handle the specific errors efficiently
		try {
			for (int i = 0; i < 8; i++) {
				System.out.print(arr[i] + "\t");
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		// Exception class which is base class of all the exceptions
		// should not be caught in first catch block
		// as its a parent of all exceptions we need not to mention
		// specific exception classes then
		catch (Exception e) {
			System.out.println(e);
		} // finally block executes irrespective of error
		finally {
			System.out.println("End of program");
		}

		//we can pipe more than one exceptions in single catch by using
		//'|' pipe operator
		//catch(ArrayIndexOutOfBoundsException | NullPointerException e)
	}

}
