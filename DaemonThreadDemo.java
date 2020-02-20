public class DaemonThreadDemo extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			//checking for daemon thread
			System.out.println("daemon thread wok");
		}
		else
		{
			System.out.println("user thread wok");
		}
	}
	public static void main(String args[])
	{
		DaemonThreadDemo t1.new DaemonThreadDemo();//creating thread
		DaemonThreadDemo t2.new DaemonThreadDemo();
		DaemonThreadDemo t3.new DaemonThreadDemo();
		t1.setDaemon(true);//now t1 is daemon thraed
		t1.start();
		t2.start();
		t3.start();
	}
}