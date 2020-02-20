import java.util.Scanner;
class prgm2
	{
		public static void main(String args[])
		{
			int size,positiveCount=0,negativeCount=0,sum=0;
			Scanner s=new Scanner(System.in);
			System.out.println("enter number of elements");
			int n=s.nextInt();
			int b[]=new int[n];
			System.out.println("enter the elements");
			for(int j=0;j<n;j++)
			{
				b[j]=s.nextInt();
				if(b[j]>=0)
				{
					positiveCount++;
					sum=sum+b[j];
				}
				else
				{
					negativeCount++;
				}
			}
			System.out.println("total number of positive elements"+positiveCount);
			System.out.println("total number of negative elements"+negativeCount);
			System.out.println("sum is"+sum);
			
		}
	}