class Table
{
	public synchronized void show(int n)
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("Table: "+n+" is: "+i+" result: "+i*n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error in code");
		}
	}
}
class Two extends Thread
{
	Table t;
	void setData(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.show(2);
	}
}
class Three extends Thread
{
	Table t;
	void setData(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.show(3);
	}
}
public class MultiThreadApplication
{
	public static void main(String x[])
	{
		Table t = new Table();
		Two to = new Two();
		to.setData(t);
		Three te = new Three();
		te.setData(t);
		te.start();
		to.start();
		te.start();
	}
}