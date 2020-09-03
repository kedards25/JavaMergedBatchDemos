package com.learning.treesetdemo;

import java.util.*;

public class TreeSetDemo {

	//set interface works on values instead of indexes
	//hence it does not allow duplicate values
	//TreeSet sorts the values by default
	public static void main(String[] args) {
		Set<String> treeSet=new TreeSet<String>();

		//String will be sorted alphabetically
		treeSet.add("One");
		treeSet.add("Four");
		treeSet.add("Three");
		treeSet.add("Two");
		treeSet.add("Grass");
		treeSet.add("Five");
		
		//unlike ListIterator we are using Iterator interface 
		//to iterate
		Iterator<String> iterator=treeSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
