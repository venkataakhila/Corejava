import java.util.*;
class Multithread1 implements Runnable{
	public void run()	
	{
		System.out.println("thread is running");
	}
	public static void main(String args[])
	{
		Multithread mt=new Multithread();
		Thread t1=new Thread(mt);
		t1.start();
	}
}