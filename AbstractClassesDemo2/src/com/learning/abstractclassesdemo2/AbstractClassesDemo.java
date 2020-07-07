package com.learning.abstractclassesdemo2;

abstract class AbstractDemo
{
	abstract void show();
	
	abstract void showMsg();
	
	abstract void disp();
}

//if a child class is not overriding all the abstract
//methods then child class also has to be declared abstract
abstract class DemoP extends AbstractDemo{
	
	@Override
	void show() {
		System.out.println("Method from DemoP");
	}
	
	@Override
	void disp()
	{
		System.out.println("Another method from DemoP");
	}
	
}

//here we will inherit the child class and override the remaining
//abstract method
public class AbstractClassesDemo extends DemoP {

	@Override
	public void showMsg()
	{
		System.out.println("Method from main class");
	}
	public static void main(String[] args) {
		AbstractClassesDemo demo=new AbstractClassesDemo();
		demo.show();
		demo.disp();
		demo.showMsg();
	}

}
