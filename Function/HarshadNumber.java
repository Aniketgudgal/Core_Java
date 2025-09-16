/*
Write a function to check whether a number is a Harshad number (divisible by sum of its digits).
*/
import java.util.Scanner;
public class HarshadNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int n = sc.nextInt();
		boolean result = harshadNumber(n);
		if(result)
		{
			System.out.printf("The number is Harshad");
		}
		else
		{
			System.out.printf("The number is not Harshad");
		}
	}
	
	public static boolean harshadNumber(int n)
	{
		int temp = n;
		int sum = 0;
		while(n != 0)
		{
			int rem = n % 10;
			sum+= rem;
			n /= 10;
		}
		if(temp % sum == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}