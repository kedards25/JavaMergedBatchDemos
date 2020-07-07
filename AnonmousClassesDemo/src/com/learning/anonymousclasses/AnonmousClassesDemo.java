package com.learning.anonymousclasses;

public class AnonmousClassesDemo {

	void disp(int num)
	{
		//we will invoke toString method from java.lang package
		//which is a default package inherited by all java applications
		//and to do so we will create an instance(object) of Object class
		//which will invoke toString method in its constructor body
		Object obj=new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "Value received as: "+num;
			}
		};
		
		//invoking toString method using object of Object Class
		System.out.println("Invoking toString method from anonymous class\n"+obj.toString());
		
	}
	
	public static void main(String[] args) {

		AnonmousClassesDemo demo=new AnonmousClassesDemo();
		demo.disp(15);
		
	}

}
