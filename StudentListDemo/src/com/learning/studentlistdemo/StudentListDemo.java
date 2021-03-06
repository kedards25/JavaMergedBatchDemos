package com.learning.studentlistdemo;

import java.util.ArrayList;
import java.util.*;


public class StudentListDemo {

	Students st1,st2,st;
	
	//collections expect classes as generic type hence we are passing
	//Integer class as generic class type
	List<Students> StudentsList;
	
	void createObjects() {
		//setting values using constructor
		StudentsList=new ArrayList();
		st1=new Students(101, "Amogh", 78.5);
		StudentsList.add(st1);
		
		//setting values using setter methods
		st2=new Students();
		st2.setId(102);
		st2.setName("Sankalp");
		st2.setMarks(85.6);
		StudentsList.add(st2);

		//accepting values from user
//		Scanner sc=new Scanner(System.in);
//		int stdId;
//		String nm;
//		double mrk;
//		
//		System.out.println("Enter details for 3 students");
//		for (int i = 0; i < 10; i++) {
//			stdId=sc.nextInt();
//			nm=sc.next();
//			mrk=sc.nextDouble();
//			st=new Students(stdId, nm, mrk);
//			StudentsList.add(st);
//		}
		
	}

	
	void showList()
	{
		System.out.println("Displaying objects of type integer");
		ListIterator<Students> iterator=StudentsList.listIterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getId());
		}
	}

	public static void main(String[] args) {
		
		StudentListDemo demo=new StudentListDemo();
		demo.createObjects();
		demo.showList();

	}

}
