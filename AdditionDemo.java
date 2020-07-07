public class AdditionDemo
{
	public static void main(String[] args)
	{
		//values received as parameters are of type String
		//so in order to perform arithmatic we have to convert them
		//to int
		int val1=Integer.parseInt(args[0]);
		int val2=Integer.parseInt(args[1]);
		System.out.println("Sum: "+(val1+val2));
	}
}