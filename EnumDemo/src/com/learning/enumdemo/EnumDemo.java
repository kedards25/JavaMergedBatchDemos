package com.learning.enumdemo;


enum COLORS{RED,GREEN,BLUE,VIOLET,INDIGO}; 
public class EnumDemo {

	void displayEnum()
	{
		//we are using COLOR as an iterator of type COLORS
		//for each COLOR in COLORS
		for( COLORS COLOR:COLORS.values())
		{
			System.out.println(COLOR);
		}
	}
	
	public static void main(String[] args) {
		EnumDemo enumDemo=new EnumDemo();
		enumDemo.displayEnum();
		

	}

}
