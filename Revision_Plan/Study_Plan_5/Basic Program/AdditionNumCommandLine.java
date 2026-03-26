/*
take command line input and add two number
*/
public class AdditionNumCommandLine
{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = a+b;
		System.out.println("Addition is: "+c);
	}
}