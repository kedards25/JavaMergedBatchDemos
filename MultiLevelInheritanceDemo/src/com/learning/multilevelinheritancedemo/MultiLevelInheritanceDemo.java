package com.learning.multilevelinheritancedemo;

interface DemoP
{
	int NUM=8;
}

//when we inherit properties from same type of container
//we use the word 'extends' otherwise 'implements' word is used
interface DemoP2 extends DemoP
{
	void showVal();
}

public class MultiLevelInheritanceDemo implements DemoP2 {

	public void showVal()
	{
		System.out.println("Value from DemoP displayed using method "
				+ "from DemoP2 in child class: "+NUM);
	}
	
	public static void main(String[] args) {
		MultiLevelInheritanceDemo demo=new MultiLevelInheritanceDemo();
		demo.showVal();

	}

}
