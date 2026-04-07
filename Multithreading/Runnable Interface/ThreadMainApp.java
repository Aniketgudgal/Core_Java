class ThImple implements Runnable
{
	public synchronized void run()
	{
		try
		{
			for(int i = 1; i < 15; i++)
			{
				System.out.println("Name is: "+Thread.currentThread().getName()+" value: "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}		
	}
}
public class ThreadMainApp
{
	public static void main(String x[])
	{
		Runnable t1 = new ThImple();
		Thread t = new Thread(t1, "Thread 1");
		t.start();
		Runnable t2 = new ThImple();
		Thread t3 = new Thread(t2, "Thread 2");
		t3.start();
	}
}