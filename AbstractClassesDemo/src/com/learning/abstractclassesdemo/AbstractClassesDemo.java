package com.learning.abstractclassesdemo;

//to implement abstraction,we need to create
//an abstract class,A class with abstract modifier
//can have abstract and non-abstract methods
//abstract methods are those methods which do not have body
//abstract classes consist of abstract methods and hence are considered to be
//incomplete classes, so we cannot create object of the abstract class
//in order to complete abstract class,we have to inherit it and must override
//all the abstract methods in child class
abstract class  AbstractDemo
{
	abstract void show();
	
	void disp()
	{
		System.out.println("Method from native class");
	}
}


public class AbstractClassesDemo extends AbstractDemo {

	@Override
	void show()
	{
		System.out.println("Overridden method from child class");
	}
	
	void disp()
	{
		System.out.println("Method from child class");
	}
	public static void main(String[] args) {

		AbstractClassesDemo abstractClassesDemo=new AbstractClassesDemo();
		abstractClassesDemo.show();
		abstractClassesDemo.disp();
				
	}

}
