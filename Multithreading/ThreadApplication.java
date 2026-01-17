class Work1 extends Thread
{
	int num;
	Work1(int num)
	{
		this.num = num;
	}
	public synchronized void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("Work1 of "+num+" iteration is: "+i+" result is: "+num*i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class Work2 extends Thread
{
	int num;
	Work2(int num)
	{
		this.num = num;
	}
	public void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("Work2 of "+num+" iteration is: "+i+" result is: "+num*i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class ThreadApplication
{
	public static void main(String x[])
	{
		try
		{	
			Work1 t1 = new Work1(1);
			Work1 t2 = new Work1(2);
			Work1 t3 = new Work1(3);
			Work1 t4 = new Work1(4);
			Work2 tw1 = new Work2(6);
			Work2 tw2 = new Work2(7);
			Work2 tw3 = new Work2(8);
			Work2 tw4 = new Work2(9);
			t1.start();
			t2.start();
			t4.start();
			t3.start();
			tw1.start();
			tw2.start();
			t3.join();
			tw3.start();
			tw4.start();
		}
		catch(IllegalMonitorStateException e)
		{
			System.out.println(e);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
}