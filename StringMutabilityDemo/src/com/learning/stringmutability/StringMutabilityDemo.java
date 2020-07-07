package com.learning.stringmutability;

public class StringMutabilityDemo {

	public static void main(String[] args) {
		
//		String is immutable class
//		immutable=>not changing
//		if an object of String class is assigned a value
//		it cannot be assigned with new value(cannot be overwritten)
//		it will allocate a new memory and old value still be there in memory
//
//		but reference variables of String class are mutable
		
		String str=new String("Kedar");
		System.out.println(str);
	
		str=new String("Adwait");
		System.out.println(str);
	}

}
