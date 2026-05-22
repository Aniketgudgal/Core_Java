/*
 Write a Java program to:
1. Check whether a given number is a Kaprekar number or not.
2. Display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer whose square can be split into two parts that
add up to the original number.
Example
45² = 2025
20 + 25 = 45
So, 45 is a Kaprekar number.
Input : Enter limit: 50
Output : Kaprekar Numbers: 1 9 45
*/
import java.util.Scanner;
public class KaprekarNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			checkKaprekarNum(i);
		}
	}
	public static void checkKaprekarNum(int n)
	{
		int temp = n;
		int digit = 0;
		while(temp != 0)
		{
			temp /= 10;
			digit++;
		}
		if(digit == 1)
		{
			temp = n * n;
			int sum = 0;
			while(temp != 0)
			{
				sum += temp % 10;
				temp /= 10;
			}
			if(sum == n)
			{
				System.out.println(n);
			}
		}
		else if(digit == 2)
		{
			temp = n * n;
			int sum = 0;
			int dig = 0;
			int count = 0;
			while(temp != 0)
			{
				count++;
				dig = dig*10 + temp % 10;
				if(count == 2)
				{
					dig = reverseNum(dig);
					sum += dig;
					dig = 0;
					count = 0;
				}
				temp /= 10;
			}
			
			if(sum == n)
			{
				System.out.println(n);
			}
		}
	}
	public static int reverseNum(int n)
	{
		int rev = 0;
		while(n != 0)
		{
			rev = rev*10+n%10;
			n /= 10;
		}
		return rev;
	}
}