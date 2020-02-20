public class Add{
	public int add(int a,int b)
	{
		return (a+b);	
	}
	public int add(int a,int b,int c)
	{
		return (a+b+c);	
	}
	public double add(double a,double b)
	{
		return (a+b);	
	}
	public static void main(String args[])
	{
		//whenever we use constructor then we need to create a object the object name must be same as class name
		Add obj=new Add();
		obj.add(10,2);
		obj.add(1,2,3);
		obj.add(10.2,12.6);
		System.out.println(obj.add(10,2));
		System.out.println(obj.add(1,2,3));
		System.out.println(obj.add(10.2,12.6));
		
		
	}
}