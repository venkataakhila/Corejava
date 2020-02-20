import java.util.Scanner;
class offer{
	public static void main(String args[])
	{
		int i=0,min,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of products");
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter rate of product");
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		min=a[0];
		for(i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}	
		}
		if(sum*0.2>min)
		{
			System.out.println("you got 20% off");
		}
		else
		{
			System.out.println("you got least product");

		}
		
		
		
	}
}