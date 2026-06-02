//join method in thread
class Test1 extends Thread 
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("First Thread: "+i+"\t: "+isAlive());
				Thread.sleep(1500);
			}
		}catch(Exception ex)
		{
			System.out.println("Exception: "+ex);
		}
	}
}
class Test2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("Second Thread: "+i+"\t: "+isAlive());
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Problem: "+ex);
		}
	}
}
public class JoinThreadApplication
{
	public static void main(String x[])
	{
		Test1  t1 = new Test1();
		Test2 t2 = new Test2();
		t1.start();
		try{
			t1.join();
		}catch(Exception ex)
		{
			System.out.println("Exception: "+ex);
		}
		t2.start();
	}
}