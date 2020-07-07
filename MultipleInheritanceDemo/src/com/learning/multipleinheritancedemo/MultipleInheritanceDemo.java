package com.learning.multipleinheritancedemo;

//all methods in an interface are public abstract by default
//interface cannot have variables it can only have constants
//we declare what is going happen and not how it is happening
interface DemoP
{
	void show();
}

interface DemoP2
{
	void dispMsg();
}

//use the keyword 'implements' to inherit an interface
public class MultipleInheritanceDemo implements DemoP,DemoP2
{
	//default access specifier of class is 'default'
	//so we have to change the access specifier to public explicitly
	//so that method signature of child will be same as that of parent
	@Override
	public void show()
	{
		System.out.println("Overridden method in child from DemoP");
	}
	
	@Override
	public void dispMsg()
	{
		System.out.println("Overridden method in child from DemoP2");
	}
	
	
	void disp()
	{
		System.out.println("Native method from child");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritanceDemo demo=new MultipleInheritanceDemo();
		demo.show();
		demo.dispMsg();
		demo.disp();
	}

}
