public class MultiCatchDemo1{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5]=23/0;
			
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException  occurs");
		}
		System.out.println("Rest of the code");
		
	}
}