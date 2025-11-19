public class Recursion
{
	public static void main(String x[])
	{
		call(1,3);
	}
	static int call(int i,int n)
	{
		if(i > n)
		{
			return 0;
		}
		else
		{
			return call(i+1,n);
			System.out.println(i);
		}
	}
}