package com.learning.singleinheritancedemo;

class DemoP
{
	void show()
	{
		System.out.println("Hello from Parent");
	}
}
//only single inheritance is supported in case of classes in Java
public class SingleInheritanceDemo extends DemoP {

	//By inheriting the class DemoP
	//class singleInheritanceDemo can access the non-private things from class DemoP
	//without creating object of DemoP
	
	void showMethod()
	{
		System.out.println("Hello from child");
	}
	
	public static void main(String[] args) {
		SingleInheritanceDemo singleInheritanceDemo=new SingleInheritanceDemo();
		singleInheritanceDemo.showMethod();
		singleInheritanceDemo.show();
	}

}
