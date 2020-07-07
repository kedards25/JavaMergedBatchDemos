package com.learning.constructorinvocationconstructordemo;

//Constructors are invoked from parent to child
//Parent constructor will be invoked first and then child
//so that value from parent class can be used in child
class DemoP
{
	int val;
	
	public DemoP()
	{
		System.out.println("Hello from parent");
	}
	public DemoP(int n)
	{
		val=n;
		System.out.println("Value from parent: "+val);
	}
	
	void show()
	{
		System.out.println("Method from parent");
	}
}

//Destructors are used to destroy the values assigned by the constructor after execution
//Destructors are invoked from child to parent
//because execution is done in child so values have to be discarded from child first
//and then child
//we need not to declare and invoke destructors as destruction is taken care 
//by garbage collection feature of Java
public class ConstructorInvocationInheritanceDemo extends DemoP {

	int num;
	
	//call to parent class constructor is given by default by child class constructor
	//in case of no-arg constructor
	public ConstructorInvocationInheritanceDemo()
	{
		System.out.println("Hello from child");
	}	
	
	//in case of parameterized constructor,call to parent class constructor
	//has to be given explicitly using super();
	public ConstructorInvocationInheritanceDemo(int x,int y)
	{
		//call to super has to be the first statement of child class constructor
		super(y);
		num=x;
		System.out.println("value from child: "+num);
	}	
//	void show()
//	{
//		//super.show();
//		System.out.println("Value from parent: "+val+" and child class: "+num);
//	}
	
	public static void main(String[] args) {
		ConstructorInvocationInheritanceDemo demo=
				new ConstructorInvocationInheritanceDemo();
		
		ConstructorInvocationInheritanceDemo demo1=
				new ConstructorInvocationInheritanceDemo(15,25);
		//demo1.show();
		

	}

}
