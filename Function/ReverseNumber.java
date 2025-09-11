/*
Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.
*/
public class ReverseNumber
{
	public static void main(String x[])
	{
		int number = 12345;
		int result = reverseNumber(number);
		System.out.printf("The original number is %d and reverse number is: %d",number,result);
	}
	
	public static int reverseNumber(int n)
	{
		int rem = 0;
		while(n != 0)
		{
			rem = rem *10 + n % 10;
			n /= 10;
		}
		return rem;
	}
}