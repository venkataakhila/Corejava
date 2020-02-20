class insert
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Applet ");
		sb.insert(1,"java");//now original string is changed
		System.out.println(sb);//prints ajavaapplet
	}
}