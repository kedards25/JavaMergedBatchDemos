public class ContinueDemo
{
	public static void main(String[] args)
	{
		int num=0;
		for(int i=1;i<10;i++)
		{
			if(i%3==0)
			{
				continue;
			//continue skips the subsequent steps and takes back control to loop
			}
			num++;	//1  2    3  4    5  6
		}
		System.out.println(num);
	}
}