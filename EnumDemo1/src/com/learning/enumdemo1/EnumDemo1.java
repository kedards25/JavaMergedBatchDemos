package com.learning.enumdemo1;

public class EnumDemo1 {
	enum COLORS{RED,GREEN,BLUE,VIOLET,INDIGO};
	
	void notifyColor(COLORS color)
	{
		switch(color)
		{
			case RED:
				System.out.println("You've chosen Red Color");
				break;
			case GREEN:
				System.out.println("You've chosen Green Color");
				break;
			case BLUE:
				System.out.println("You've chosen Blue Color");
				break;
			case VIOLET:
				System.out.println("You've chosen Violet Color");
				break;
			case INDIGO:
				System.out.println("You've chosen Indigo Color");
				break;
				
		}
	}
	
	public static void main(String[] args) {
		EnumDemo1 enumDemo1=new EnumDemo1();
		enumDemo1.notifyColor(COLORS.INDIGO);

	}

}
