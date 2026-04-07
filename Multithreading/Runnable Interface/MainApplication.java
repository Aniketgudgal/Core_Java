class ThreadApp implements Runnable
{
	public void run()
	{
		try
		{
			for(int i = 0; i < 10; i++)
			{
				if(i == 5)
				{
					Thread.sleep(2000);
				}
				System.out.println("Name of Thread is: "+Thread.currentThread().getName()+" value is: "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is: "+e);
		}
	}
}
public class MainApplication
{
	public static void main(String args[])
	{
		Runnable r = new ThreadApp();
		Thread t = new Thread(r);
		t.setName("First Thread");
		t.start();
	}
}