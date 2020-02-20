class pattern
{
	static void patterns(int n)
	{
		int i,j,num=1;
		for(i=0;i<n;i++)
		{
			num=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();	
		}
		for(i=n-1;i>=1;i--)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
				num++;
			}
			System.out.println();	
		}
		
	}
	public static void main(String args[])
	{
		int n=6;
		patterns(n);
	}
	
}