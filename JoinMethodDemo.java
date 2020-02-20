class JoinMethodDemo extends Thread{
public void run()
{
	for(int i=1;i<5;i++)
	{
		try{
				Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
				System.out.println(e);
				
		}
		System.out.println(i);
	}
}

	public static void main(String args[])
	{
			JoinMethodDemo t1=new JoinMethodDemo();
			JoinMethodDemo t2=new JoinMethodDemo();
			JoinMethodDemo t3=new JoinMethodDemo();
			t1.start();
			try
			{
				t1.join(1500);
			}catch(Exception e){System.out.println(e);}
			t2.start();
			t3.start();
	}
		
}