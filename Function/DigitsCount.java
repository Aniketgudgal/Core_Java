/*
Write a function to count the number of digits in a given number.
*/
import java.util.Scanner;
public class DigitsCount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = xyz.nextInt();
		int result = digitsCount(num);
		System.out.printf("The number of digits in given number is: %d",result);
	}
	
	public static int digitsCount(int n)
	{
		int i = 0;
		while(n != 0)
		{
			n /= 10;
			i++;
		}
		return i;
	}
}