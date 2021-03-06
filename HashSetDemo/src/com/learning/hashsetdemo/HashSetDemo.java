package com.learning.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetDemo {

	//set interface works on values instead of indexes
	//hence it does not allow duplicate values
	//HashSet does not sort the values by default
	//hence insertion of elements is faster
		public static void main(String[] args) {
			Set<String> hashSet=new HashSet();

			//String will not be sorted alphabetically
			hashSet.add("One");
			hashSet.add("Four");
			hashSet.add("Three");
			hashSet.add("Two");
			hashSet.add("Grass");
			hashSet.add("Five");
			
			Iterator<String> iterator=hashSet.iterator();
			
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			
		}
}
