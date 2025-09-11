/*
Sum of Digits
Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.
Example: Input 123 → Output: 6.
*/
public class DigitsSum
{
	public static void main(String x[])
	{
		int number = 156;
		int result = sumOfDigits(number);
		System.out.printf("The number of sum %d is %d",number,result);
	}
	
	public static int sumOfDigits(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			sum += n % 10;
			n = n / 10;
		}
		
		return sum;
	}
}