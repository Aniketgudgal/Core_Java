/*
Write program to input two values using command line argument and perform its swapping?
*/
public class CommandLine
{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		System.out.println("Before Swapping");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		// Swapping Logic
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
}