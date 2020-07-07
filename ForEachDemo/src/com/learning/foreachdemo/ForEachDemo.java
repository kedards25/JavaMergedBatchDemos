package com.learning.foreachdemo;

public class ForEachDemo {
	
	int [] arr= {5,2,74,1,3,4,12,3};
	//whenever we are unaware of size of an array or a range
	//we should use foreach loop 
	
	void dispArr()
	{
		for(int num:arr)
		{
			System.out.println(num);
		}
	}
	
	
	public static void main(String[] args) {
		ForEachDemo forEachDemo=new ForEachDemo();
		forEachDemo.dispArr();

	}

}
