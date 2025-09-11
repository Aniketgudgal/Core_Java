/*
Fibonacci Series (n terms)
Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.
Example: Input 5 → 0 1 1 2 3
*/
public class FibonacciSeries
{
	public static void main(String x[])
	{
		printFibonacci(3);
	}
	public static void printFibonacci(int n)
	{
		int f1 = 0;
		int f2 = 1;
		int sum = f1 + f2;
		int j = 3;
		System.out.printf(" %d %d",f1,f2);
		while(j <= n)
		{
			System.out.printf(" %d",sum);
			f1 = f2;
			f2 = sum;
			sum = f1 + f2;
			j++;
		}
	}
}