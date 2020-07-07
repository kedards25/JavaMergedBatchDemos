public class HelloUserDemo
{
	//String args helps us to accept input as collection of 	
	//string values stored in args variable
	public static void main(String[] args)
	{
		//Treats statement written in brackets as  line
		//and points the cursor to next line
		System.out.println("Hello ");

		//Treats statement written in brackets as  line
		System.out.print("World,");

		System.out.println("Welcome");
		System.out.println("Hello "+args[0]+" and "+args[1]);
	}
}