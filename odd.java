import java.util.*;
class odd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting interval");
		int n=s.nextInt();
		System.out.println("enter the last limit");
		int m=s.nextInt();
		for(int i=n;i<m;i++)
		if(i%2!=0)
		{
			System.out.println(i);
		}

	}
}