class Argcons
{
	Argcons1 obj;
	Argcons(Argcons1 obj)
	{
		this.obj=obj;
	}
	void display()
	{
		System.out.println(obj.data);//using data member of Argcons1 class
	}
}
class Argcons1
{
	int data=10;
	Argcons1()
	{
		Argcons b=new Argcons(this);
		b.display();
	}
	public static void main(String args[])
	{
		Argcons1 a=new Argcons1();
	}
}
