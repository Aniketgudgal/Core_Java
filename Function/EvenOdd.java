/*
Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/
public class EvenOdd
{
	public static void main(String x[])
	{
		int n = 10;
		boolean check = isEven(n);
		System.out.printf("The number is even: %b",check);
		boolean odd = isOdd(n);
		System.out.printf("\nThe number is odd: %b",odd);
		
	}
	
	public static boolean isEven(int n)
	{
		if(n % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int b)
	{
		if(b % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}