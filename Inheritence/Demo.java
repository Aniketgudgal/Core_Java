class Parent
{
	public void m1()
	{
		System.out.println("M1 parent");
	}
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("M1 child");
	}
	public void m2()
	{
		System.out.println("M2 child");
	}
}
public class Demo
{
	public static void main(String x[])
	{
		Parent p = new Child();
		p.m1();
		p.m2();
		
	}
}