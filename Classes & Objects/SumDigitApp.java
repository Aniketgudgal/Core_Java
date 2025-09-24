/*
17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.
*/
import java.util.Scanner;
class DigitSumCalculator
{
	int calculateSum(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			sum+= n%10;
			n /= 10;
		}
		return sum;
	}
}
public class SumDigitApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = sc.nextInt();
		DigitSumCalculator d1 = new DigitSumCalculator();
		int result = d1.calculateSum(num);
		System.out.printf("The sum of digit is: %d",result);
	}
}