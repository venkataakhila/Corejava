class parent1{
	void show()
	{
		System.out.println("this is a parent class mtd");
	}
}
class Child extends parent1{
	void show()
	{
		super.show();
		System.out.println("this is a child class mtd");
	}
}
class mo1
{
	public static void main(String args[])
	{
	parent1 ob=new parent1();
	ob.show();
	Child obj=new Child();
	obj.show();
	}
}
		