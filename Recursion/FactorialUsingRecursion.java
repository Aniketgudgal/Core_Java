/*
Write a program to calculate the factorial of a given number using recursion.
*/
import java.util.Scanner;
public class FactorialUsingRecursion
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		int result = factCal(n,1);
		System.out.println("The factorial of number is: "+result);
	}
	static int factCal(int n, int fact)
	{
		if(n < 1)
		{
			return fact;
		}
		else
		{
			return factCal(n-1,fact*n);
		}
	}
}