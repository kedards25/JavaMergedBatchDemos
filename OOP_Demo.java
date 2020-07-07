import java.util.*;
public class OOP_Demo
{
	int num1,num2,ans;
	Scanner scanner=new Scanner(System.in);

	//input module
	void acceptNums()
	{
		System.out.println("Enter two numbers");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
	}

	//process module
	void addNums()
	{
		ans=num1+num2;
	}

	//display module
	void displayAns()
	{
		System.out.println("Answer: "+ans);
	}

	//another process module
	void subtractNums()
	{
		ans=num1-num2;
	}

	public static void main(String[] args)
	{
		//syntax to create object of the class in order to access members of the class
		OOP_Demo oopDemo=new OOP_Demo();
		System.out.println("Performing addition");
		oopDemo.acceptNums();
		oopDemo.addNums();
		oopDemo.displayAns();

		System.out.println("Performing subtraction");
		oopDemo.acceptNums();
		oopDemo.subtractNums();
		oopDemo.displayAns();

	}


}