class calculation{
	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	
	System.out.println("factorial is"+fact);
	}
	public static void main(String args[])
	{
		//creating anonymousobject
		new calculation().fact(6);
	} 
}	