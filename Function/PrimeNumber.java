/*
Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.
*/
public class PrimeNumber
{
	public static void main(String x[])
	{
		int number = 13;
		boolean result = isPrime(number);
		System.out.printf("The number %d is prime or not: %b",number,result);
	}
	
	public static boolean isPrime(int x)
	{
		int j = 2;
		boolean flag = true;
		while(j < x)
		{
			if(x % j == 0)
			{
				flag = false;
				break;
			}
			j++;
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}