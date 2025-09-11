/*
Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.
*/
public class Factorial
{	
	public static void main(String x[])
	{
		int n = 5;
		int number = factorial(n);
		System.out.printf("The factorial of %d is %d",n,number);
	}
	
	public static int factorial(int x)
	{
		int sum = 1;
		while(x != 0)
		{
			int rem = x % 10;
			sum *= rem;
			x--;
		}
		
		return sum;
	}
}