public class IfDemo
{
	public static void main(String[] args)
	{
		int val1=Integer.parseInt(args[0]);
		if(val1>10)
		{
			System.out.println(val1+" is greater than  10");
		}
		else
		{
			System.out.println(val1+" is smaller than  10");
		}
	}
}