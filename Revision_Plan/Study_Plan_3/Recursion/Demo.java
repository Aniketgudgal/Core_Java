class ABC
{
	private static ABC a= null;
	private ABC()
	{
	}
	public static ABC getInstance()
	{
		if(a == null)
		{
			a = new ABC();
		}
		return a;
	}
}
public class Demo
{
	public static void main(String x[])
	{
		/*ABC a = ABC.getInstance();
		ABC b = ABC.getInstance();
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		*/
		add(10,20);
	}
	int add(int a)
}