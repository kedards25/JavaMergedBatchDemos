package com.learning.collectionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentListDemo {

	StudentDetails st1,st2,st3,st4;
	
	List<StudentDetails> studList=new ArrayList();
	
	void createStdObj()
	{
		st1=new StudentDetails(101, "Sankalp", "Jogeshwari");
		st2=new StudentDetails(102, "Amogh", "Andheri");
		st3=new StudentDetails(103, "Devangi", "Jogeshwari");
		st4=new StudentDetails(104, "Talha", "Ratnagiri");
		
	}
	
	void addObjects()
	{
		studList.add(st1);
		studList.add(st2);
		studList.add(st3);
		studList.add(st4);
		studList.add(new StudentDetails(105, "Yogesh", "Nallasopara"));
	}
	
	void showDetails()
	{
//		ListIterator<StudentDetails> studIterator=studList.listIterator();
//		while(studIterator.hasNext())
//		{
//			//following step will iterate through all the objects 
//			//of StudentDetails class
//			//System.out.println(studIterator.next());
//			
//			//in order to display the details we should invoke getter methods
//			//from StudentDetails class using object in studIterator.next() method
//			//System.out.println("Id: "+studIterator.next().getId()+" Name: "+studIterator.next().getName());
//			
//			
//		}
		for (StudentDetails student : studList) {
			System.out.println("Id: "+student.getId()+" Name: "+student.getName());
		}
	}
}
