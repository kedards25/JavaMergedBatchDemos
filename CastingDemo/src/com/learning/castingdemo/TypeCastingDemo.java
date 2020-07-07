package com.learning.castingdemo;

public class TypeCastingDemo {

	int val=5;
	double num=5.6;
	
	void dispVal()
	{
//		implicit casting
//		num=val;
//		System.out.println("After casting value to other type: "+num);

//		explicit casting
		val=(int)num;
		System.out.println("After casting value to other type: "+val);
	}
}
