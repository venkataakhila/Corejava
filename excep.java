class excep{
	public static void main(String args[])
	{
		try
		{
			//code to raise an exception
			int data=21/0;
		}catch(ArithmeticException e)
		{
			System.out.println("rest of the code");
		}

	}
}