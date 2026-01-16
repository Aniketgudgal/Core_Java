//import java.util.InterruptedExceptio;
import java.util.*;
class Thread1 extends Thread
{
	public synchronized void run()
	{
		try{
			
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("Thread 1: "+i);
				Thread.sleep(1000);
				wait(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("Thread 2: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
	}
}
public class MainApplication
{
	public synchronized static void main(String x[])
	{
		try
		{
			Thread1 t1 = new Thread1();
			Thread2 t2 = new Thread2();
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			System.out.println("All thread execution done");
			Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("execption in main class");
		}
	}
}