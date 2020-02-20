class argThis{
	void displaymethod(argThis obj)
	{
		System.out.println("method is invoked");
	}
	void thisex()
	{
		displaymethod(this);
	}
	public static void main(String args[])
	{
		argThis s1=new argThis();
		s1.thisex();
	}
}