package com.learning.returndemo;

import java.util.Scanner;

public class ReturnDemo {

	Scanner scanner=new Scanner(System.in);
	
	int num1,num2,num3,sum;
	double avg;
	
	void acceptData()
	{
		System.out.println("Enter three numbers to calculate the average");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
	}
	
	//The data type of the value,the function is returning will be return type of the
	//function,if function is not returning any kind of value then return type is declared
	//as void
	int calcSum()	//called function
	{
		sum=num1+num2+num3;
		//in order to pass value from one function to other or to main function
		//we use the keyword return
		return sum;
	}
	
	void calcAvg()
	{
		//in the following line,function is being invoked
		//as both functions are in same class,we need not to invoke
		//function with object
		//value received from called function needs to be accepted and
		//saved in new variable
		int ans=calcSum();	//calling function
		//in order to get accurate avg we need to cast ans which is of type int
		//into double,this concept is called as type casting
		avg=(double)ans/3;
		System.out.println("The average: "+avg);
	}
	
	public static void main(String[] args) {
		ReturnDemo returnDemo=new ReturnDemo();
		returnDemo.acceptData();
		returnDemo.calcSum();
		//int val=returnDemo.calcSum();
		returnDemo.calcAvg();

	}

}
