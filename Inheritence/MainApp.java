interface Demo1
{
	public void m1();
}
interface Demo2
{
	public void m1();
}
class Imp implements Demo1, Demo2
{
	public void m1()
	{
		System.out.println("IMP m1");
	}
}
public class MainApp
{
	public static void main(String x[])
	{
		Demo1 p = new Imp();
		p.m1();
	}
}