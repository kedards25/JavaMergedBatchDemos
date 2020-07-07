package com.learning.needofgenerics;

public class NeedOfGenerics {
	 
	int val;
	double num;
	String name;
	
	void setValues()
	{
		val=15;
		num=8.7;
		name="Sankalp";
	}
	
	void showValues()
	{
		System.out.println("int: "+val+"\ndouble: "+num+"\nString: "+name);
	}
	
	public static void main(String[] args) {
		NeedOfGenerics needOfGenerics=new NeedOfGenerics();
		needOfGenerics.setValues();
		needOfGenerics.showValues();
	}
}
