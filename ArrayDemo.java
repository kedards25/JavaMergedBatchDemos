public class ArrayDemo
{
	public static void main(String[] args)
	{
		int []num=new int[3];
		int []num1=new int[]{6,3,9};	//num1[2]=>9
		int []num2={7,2,3};
		int []num3=new int[3];
		num3[0]=4;
		num3[1]=8;
		num3[2]=1;
		for(int i=0;i<3;i++)
		{
			num[i]=Integer.parseInt(args[i]);	
		}

		for(int i=0;i<3;i++)
		{
			System.out.println(num[i]+"\t");
		}

	}
}