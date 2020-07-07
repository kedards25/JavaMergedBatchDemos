package com.learning.enumerationdemo;

enum Fruits{Mango,Apple,Banana,Orange,Chikoo};

public class EnumerationDemo {
	
	void makeJuice(Fruits fruit)
	{
		switch (fruit) {
		case Mango:
			System.out.println("Let's make Mango juice");
			break;

		case Chikoo:
			System.out.println("Let's make Chikoo juice");
			break;
			
		case Apple:
			System.out.println("Let's make Apple juice");
			break;
			
//		case Banana:
//			System.out.println("Let's make Banana juice");
//			break;
//			
		case Orange:
			System.out.println("Let's make Orange juice");
			break;
			
		default:
			System.out.println("Fruit not available in this season");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		EnumerationDemo enumerationDemo=new EnumerationDemo();
		enumerationDemo.makeJuice(Fruits.Banana);
		
		
	}

}
