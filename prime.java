import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int i,j,c=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n numner");
		int n=s.nextInt();
		System.out.println("enter m number");
		int m=s.nextInt();
		for(i=n;i<m;i++)
		{
			for(j=i;j>0;j--)
			{
				if(i%j==0)
				{
					c++;
				}	
			}
			if(c==2)
			{
				System.out.println(i);
				sum=sum+i;
			}
			c=0;
		}
		System.out.println("sum"+sum);
	}
}