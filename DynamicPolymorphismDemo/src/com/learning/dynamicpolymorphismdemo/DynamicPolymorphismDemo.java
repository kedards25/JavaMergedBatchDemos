package com.learning.dynamicpolymorphismdemo;

class DemoP
{
	void show()
	{
		System.out.println("from parent");
	}
}

public class DynamicPolymorphismDemo extends DemoP {
	
	void show()
	{
		System.out.println("from child");
	}
	
	
	public static void main(String[] args) {
		
		//parent object is initialized with child class
		//method call will be decided at runtime
		//depending upon the class with which the object is getting
		//initialized
		DemoP demo=new DynamicPolymorphismDemo();
		demo.show();
	}

}
