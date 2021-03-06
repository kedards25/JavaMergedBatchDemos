package com.learning.collectionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class NumListDemo {

	Integer num1,num2,num3,num4,num5,num;
	List<Integer> numList=new ArrayList();;
	void createObjects()
	{
		num1=new Integer(102);
		num2=new Integer(103);
		num3=new Integer(104);
		num4=new Integer(105);
		num5=new Integer(104);
	}
	
	void addNums() 
	{	
		//numList is of type Integer
		//hence it will accept int values
		System.out.println("Added values by itself");
		numList.add(new Integer(101));
		numList.add(num1);
		numList.add(num2);
		numList.add(num3);
		numList.add(num4);
		numList.add(num5);
		numList.add(106);
		
	}
	
	void AddNumsByIteration()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 values");
		for (int i = 0; i < 5; i++) {
			//for each value entered by the user,same object i.e. num will 
			//be re-initialized with new value
			System.out.println("Accepting and assigning "+(i+1)+" value");
			num=new Integer(sc.nextInt());
			
			//lets add the value in numList as soon as value is assigned
			System.out.println("Adding "+(i+1)+" value in numList");
			numList.add(num);
		}
	}
	
	void showNums()
	{
		ListIterator<Integer> numIterator=numList.listIterator();
		while(numIterator.hasNext())
		{
			System.out.println(numIterator.next());
		}
	}
	
	
	void arrayListProperties()
	{
//		System.out.println(numList.size());
		
//		System.out.println(numList.get(3));
		
//		System.out.println("Before: "+numList.size());
//		System.out.println(numList.remove(num2));
//		System.out.println("After: "+numList.size());
				
//		System.out.println("Before: "+numList.size());
//		System.out.println(numList.remove(2));
//		System.out.println("After: "+numList.size());
		
		System.out.println("Before: "+numList.size());
		numList.clear();
		System.out.println("After: "+numList.size());
		
	}
	
		
}
