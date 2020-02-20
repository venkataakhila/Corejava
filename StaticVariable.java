class student8{
	int rollno;//instance variable
	String name;
	static String college="SRM University";//static variable
	student8(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

}
public class StaticVariable{
	public static void main(String args[])
	{
		student8 s1=new student8(101,"akhi");
		student8 s2=new student8(111,"akhila");
		//we can change the college of all objects by the single line of code
		//instead of invoking individually as Student.college="srm" 
		s1.display();
		s2.display();
	}
}