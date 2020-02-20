class parent
{
	//single level inheritance
	public void p1()
	{
		System.out.println("parent method");
	} 
}
public class Child extends parent{

	public void c1()
	{
		System.out.println("child method");
	}

	public static void main(String args[])
	{
		Child cobj=new Child();
		cobj.p1();
		cobj.c1();
	}
}
