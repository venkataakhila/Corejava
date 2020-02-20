class A{
	public void methodA()
	{
		System.out.println("super class method a");
	}
}
class B extends A{
	public void methodB()
	{
		System.out.println("sub class method b");
	}
}
class C extends A{
	public void methodC()
	{
		System.out.println("sub class method c");
	}
}
class heira
{
	public static void main(String args[])
	{
	A obj1=new A();
	B obj2=new B();
	C obj3=new C();
	obj1.methodA();
	obj2.methodB();
	obj3.methodC();
	}	
}