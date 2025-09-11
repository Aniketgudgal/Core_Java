/*
Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.
*/
public class MaximumTwoNumber
{
	public static void main(String x[])
	{
		int max = findMax(20,10);
		System.out.printf("The max Number is: %d",max);
	}
	
	public static int findMax(int a, int b)
	{
		if(a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}