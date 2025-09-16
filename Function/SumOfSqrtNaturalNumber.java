/*
Write a function to find the sum of squares of first n natural numbers.
*/
import java.util.Scanner;
public class SumOfSqrtNaturalNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the nth natural number: ");
		int n = sc.nextInt();
		sqrtSumNatural(n);
	}
	
	public static void sqrtSumNatural(int n)
	{
		int temp = n;
		int i = 1;
		int sum = 0;
		while(i <= n)
		{
			sum += i*i;
			i++;
		}
		System.out.printf("The sum of squares of first %d number is: %d",temp,sum);
	}
}