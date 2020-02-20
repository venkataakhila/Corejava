class parent1{
	void view()
	{
		System.out.println("this is a parent class mtd");
	}
}
class Child extends parent1{
	void view()
	{
		System.out.println("this is a child class mtd");
	}
}
class mo
{
	public static void main(String args[])
	{
	parent1 ob=new parent1();
	ob.view();
	Child obj=new Child();
	obj.view();
	}
}
		