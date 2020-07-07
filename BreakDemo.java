public class BreakDemo
{
	public static void main(String[] args)
	{
		int num=0;
		for(int i=1;i<10;i++)
		{
			if(i%3==0)
			{
				break;
			}
			num++;	//1  2
		}
		System.out.println(num);
	}
}