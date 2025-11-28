/*
Write a program to check whether a given number is a palindrome using recursion.
*/
import java.util.Scanner;
public class CheckNumberPalindrome
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int result = 0;
		result = reverseNumber(num, result);
		if(result == num)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
	static int reverseNumber(int num, int result)
	{
		if(num < 1)
		{
			return result;
		}
		else
		{
			int rem = num % 10;
			result = result*10 + rem;
			num /= 10;
			return reverseNumber(num, result);
		}
	}
}