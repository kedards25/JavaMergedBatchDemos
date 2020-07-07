package com.learning.staticpolymorphismdemo;

//Static polymorphism takes place in single class
//methods having same name with different parameters 
public class StaticPolymorphismDemo {

	//these methods are aware of the params they are going to receive
	//and based on param their invocation will take place
	
	void show()
	{
		System.out.println("Method without params");
	}
	
	void show(int num)
	{
		System.out.println("Method with int param: "+num);
	}
	
	void show(float val)
	{
		System.out.println("Method with int param: "+val);
	}
	
	public static void main(String[] args) {
		StaticPolymorphismDemo demo=new StaticPolymorphismDemo();
		demo.show();
//		java accepts floating values in double type by default
//		in order to pass float data type we have to suffix it with 'F'		
		demo.show(5.6F);
		demo.show(8);

	}

}
