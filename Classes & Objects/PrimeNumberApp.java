/*
14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/
import java.util.Scanner;
class PrimeChecker
{
	boolean isPrime(int n)
	{
		boolean flag = true;
		int i = 2;
		while(i < n)
		{
			if(n%i == 0)
			{
				flag = false;
			}
			i++;
		}
		if(flag)
		{
			return flag;
		}
		else
		{
			return flag;
		}
	}
}
public class PrimeNumberApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = sc.nextInt();
		PrimeChecker p1 = new PrimeChecker();
		boolean result = p1.isPrime(num);
		if(result)
		{
			System.out.printf("The number is prime");
		}
		else
		{
			System.out.printf("The number is not prime");
		}
	}
}