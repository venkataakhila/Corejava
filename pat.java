class pat
{
	public static void main(String args[])
	{
		int i,j,n=6;
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}