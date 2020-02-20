import java.util.Scanner;
class bill
{
	public static void main(String args[])
	{
		int billnum,date;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the bill number");
		billnum=s.nextInt();
		System.out.println("Enter the date");
		date=s.nextInt();
		if((date>0&&date<=31)&&(billnum%100==date%100 || billnum%10==date%10 || billnum%date==0 ))
		{
			System.out.println("you are the lucky winner ");
		} 
		else
		{
			System.out.println("bad luck");
		}
	
	}
}


