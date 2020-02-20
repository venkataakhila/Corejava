class student9{
	int rollno;//instance variable
	String name;
	static String college="SRM University";//static variable
	//static method to change the value of static variable
	static void change()
	{
		college="srm";
	}

	student9(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	
}
public class StaticVariable1{
	public static void main(String args[])
	{
		student9.change();
		student9 s1=new student9(101,"akhi");
		student9 s2=new student9(111,"akhila");
		//we can change the college of all objects by the single line of code
		//instead of invoking individually as Student.college="srm" 
		s1.display();
		s2.display();
	}
}