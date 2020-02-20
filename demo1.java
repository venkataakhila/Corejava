class demo1 {
	protected  void display()
	 {
		 System.out.println("display method parent");
	 }
}
 class tes extends demo1
 {
	public void display()
	 {
		 System.out.println("child class");
	 }
	 public static void main(String args[])
	 {
		 demo1 d=new tes();
		 d.display();
	 }
	 
 }