package com.learning.arraydequedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<Integer> arrayDeque=new ArrayDeque();
		arrayDeque.add(101);
		arrayDeque.add(new Integer(102));
		arrayDeque.add(103);
		arrayDeque.add(104);
		arrayDeque.add(105);
		
		System.out.println(arrayDeque);
		

	}

}
