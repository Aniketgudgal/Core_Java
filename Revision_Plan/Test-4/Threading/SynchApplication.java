//synchronization
class Table
{
	public synchronized void showTable(int no)
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("table of: "+no+": "+no+" * "+i+" = "+no*i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception: "+ex);
		}
	}
}
class Two extends Thread
{
	Table t;
	public void setTable(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.showTable(2);
	}
}
class Three extends Thread
{
	Table t;
	public void setTable(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.showTable(3);
	}
}
public class SynchApplication
{
	public static void main(String x[])
	{
		Table t = new Table();
		Two t1 = new Two();
		t1.setTable(t);
		Three t2 = new Three();
		t2.setTable(t);
		t1.start();
		t2.start();
	}
}