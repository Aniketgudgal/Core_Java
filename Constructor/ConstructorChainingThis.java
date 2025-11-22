class First
{
	First(int x)
	{
		this(5.1f);
		System.out.println("The Value of int x is: "+x);
	}
	First(float x)
	{
		System.out.println("The Value of float x is: "+x);
	}
}
public class ConstructorChainingThis
{
	public static void main(String x[])
	{
		First f1 = new First(100);
	}
}