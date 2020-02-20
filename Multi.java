class Multiinheritance{
	protected String str;
	Multiinheritance()
	{
		str="This ";
	}
}
class ChildClass1 extends Multiinheritance{
	ChildClass1()
	{
		str=str.concat("is  ");
	}
}
class ChildClass2 extends ChildClass1{
	ChildClass2()
	{
		str=str.concat("Multilevel Inheritance ");
	}
}
class ChildClass3 extends ChildClass2{
	ChildClass3()
	{
		str=str.concat("Example");
	}
	void display()
	{
		System.out.println(str);
	}
}
class Multi{
	public static void main(String args[])
	{
		ChildClass3 obj=new ChildClass3();
		obj.display();
	}
}
		