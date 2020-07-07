import java.util.Scanner;
public class MultiArrDemo
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int[][] mArr=new int[2][2];
		int[][] mArr2=new int[][]{
						{2,4},
						{7,5},
					};

		int[][] mArr3={
					{2,4},
					{7,5},
				};
		System.out.println("Please enter 4 values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				//mArr[i][j]=Integer.parseInt(args[i]);
				mArr[i][j]=scanner.nextInt();
			}
		}
		//For each value of row,we want all the values of column to be executed
		//when column exceeds its limit,row value should be increased
		//in order to achieve this we will use nested loops
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(mArr[i][j]+"\t");
			}
			System.out.println();
		}


	}
}