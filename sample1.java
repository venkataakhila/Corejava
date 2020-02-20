class Bike
{
	int speed=90;
}
class Cycle extends Bike
{
	int speed=100;
	void show()
	{
		System.out.println("average speed"+super.speed);
		System.out.println("average speed"+speed);
	}
}
class sample1
{
	public static void main(String e[])
	{
		Cycle c=new Cycle();
		c.show();
	}
} 
		