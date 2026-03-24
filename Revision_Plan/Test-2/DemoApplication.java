class A
{
	int a;
	A(int a)
	{
		this.a = a;
		System.out.println("This is A class: "+this.hashCode());
	}
}
class B extends A
{
	int b;
	B(int b)
	{
		super(b);
		this.b = b;
		System.out.println("This is B class: "+this.hashCode());
	}
}
class C extends B
{
	int c ;
	C(int c)
	{
		super(c);
		this.c = c;
		System.out.println("This c class: "+this.hashCode());
	}
}
public class DemoApplication
{	
	public static void main(String x[])
	{
		C c1 = new C(10);
	}
}