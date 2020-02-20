abstract class Bank{
	abstract int getRateOfInterest();//method declared
}
class AXIS extends Bank{
	int getRateOfInterest(){return 12;}//method definition
}
class HDFC extends Bank{
	int getRateOfInterest(){return 10;}//method definition
}
class AbstractionBank{
	public static void main(String args[])
	{
		Bank b;
		b=new AXIS();
		System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");
		b=new HDFC();
		System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");
	}
}
		