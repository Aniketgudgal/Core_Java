/*
11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/
import java.util.Scanner;
class NumberReverser
{
	int reverse(int n)
	{
		int rev = 0,rem;
		while(n != 0)
		{
			rem = n % 10;
			rev = rev*10 + rem;
			n /= 10;
		}
		return rev;
	}
}
public class ReverseApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int n = sc.nextInt();
		NumberReverser n1 = new NumberReverser();
		int revNum = n1.reverse(n);
		System.out.printf("The Reverse Number is: %d",revNum);
	}
}