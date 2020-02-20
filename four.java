import java.util.Scanner;
class four
{
	public static void main(String args[])
	{
	int i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=s.nextInt();
	if(n%2==0)
	{
		System.out.println("can be divided");
	}
	else
	{
		System.out.println("cannot divided");
	}
	for(i=1;i<n;i++)
	{
		System.out.println("probability is"+" "+i+" "+(n-i));
	}
	}
}