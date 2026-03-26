/*
Swap number using command line argument
*/
public class SwappingNum
{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		System.out.println("Before Swapping");
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
		// swapping
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
	}
}