class parent{ }
	class Children extends parent{
		void check()
		{
			System.out.println("Successful casting");
		}
		public static void show(Parent p)
		{
			if(p instanceof Children)
			{
				Children b1=(Children)p;
				b1.check();
			}
		}
		public static void main(String args[])
		{
			Parent p=new Children();	
			Children.show(p);
				
		}
	}
}
	